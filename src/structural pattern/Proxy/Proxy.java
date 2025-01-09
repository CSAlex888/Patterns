package Proxy;

interface Bank {
    void setUserMoney(User user, double money);
    int getUserMoney(User user);
}
class CitiBank implements Bank {
    @Override
    public void setUserMoney(User user, double money) {
        UserDAO.updateMoney(user, money);
    }

    @Override
    public int getUserMoney(User user) {
        return UserDAO.getMoney(user);
    }
}
class BankSecurityProxy implements Bank {
    private Bank bank;

    public BankSecurityProxy(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void setUserMoney(User user, double money) {
        if (!SecurityManager.authorize(user, BankAccounts.Manager)) {
            throw new SecurityException("User can't change money value");
        }
        bank.setUserMoney(user, money);
    }

    @Override
    public int getUserMoney(User user) {
        if (!SecurityManager.authorize(user, BankAccounts.Manager)) {
            throw new SecurityException("User can't get money value");
        }
        return bank.getUserMoney(user);
    }
}
class User {
    private String login;

    public User(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}

class UserDAO {
    private static int money = 0; // Имитация базы данных для хранения денег пользователя

    public static void updateMoney(User user, double money) {
        UserDAO.money = (int) money;
        System.out.println("User " + user.getLogin() + " money updated to: " + money);
    }

    public static int getMoney(User user) {
        System.out.println("Getting money for user: " + user.getLogin());
        return money;
    }
}

class AuthManager {
    public static User authorize(String login, String password) {
        if(login.equals("manager") && password.equals("manager")){
            return new User(login);
        }
        return null;
    }
}

class SecurityManager {
    public static boolean authorize(User user, BankAccounts accessType) {
        return user.getLogin().equals("manager") && accessType == BankAccounts.Manager;
    }
}

enum BankAccounts {
    Manager,
    User
}

class BankFactory {
    public static Bank createUserBank(User user) {
        return new CitiBank();
    }
}
