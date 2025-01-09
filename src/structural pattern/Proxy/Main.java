package Proxy;

public class Main {
    public static void main(String[] args) {
        // Код без проверки безопасности:
        User user1 = AuthManager.authorize("manager", "manager");
        Bank bank1 = BankFactory.createUserBank(user1);
        bank1.setUserMoney(user1, 1000000);
        System.out.println("User money: " + bank1.getUserMoney(user1));


        // Код с включённой проверкой безопасности:
        User user2 = AuthManager.authorize("manager", "manager");
        Bank bank2 = BankFactory.createUserBank(user2);
        bank2 = new BankSecurityProxy(bank2);
        try {
            bank2.setUserMoney(user2, 2000000);
        } catch (SecurityException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("User money: " + bank2.getUserMoney(user2));
    }
}
