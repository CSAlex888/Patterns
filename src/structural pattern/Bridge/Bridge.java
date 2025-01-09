package Bridge;

class UserImpl {
    public void run() {
    }
    public void fly() {
    }
}
class UserDonkeyImpl extends UserImpl {
    @Override
    public void run() {
        System.out.println("Осел бежит");
    }
    @Override
    public void fly() {
        System.out.println("Осел не умеет летать");
    }
}

class UserDragonImpl extends UserImpl {
    @Override
    public void run() {
        System.out.println("Дракон бежит");
    }
    @Override
    public void fly() {
        System.out.println("Дракон летит");
    }
}
class User {
    private UserImpl realUser;

    public User(UserImpl impl) {
        realUser = impl;
    }

    public void transformToDonkey() {
        realUser = new UserDonkeyImpl();
    }

    public void transformToDragon() {
        realUser = new UserDragonImpl();
    }

    public void run() {
        realUser.run();
    }

    public void fly() {
        realUser.fly();
    }
}

