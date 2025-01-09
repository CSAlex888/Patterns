package Bridge;

public class Main {
    public static void main(String[] args) {
        User user = new User(new UserDonkeyImpl());
        System.out.println("Текущая форма: Осел");
        user.run();
        user.fly();

        System.out.println();
        user.transformToDragon();
        System.out.println("Текущая форма: Дракон");
        user.run();
        user.fly();

        System.out.println();
        user.transformToDonkey();
        System.out.println("Текущая форма: Осел");
        user.run();
        user.fly();


    }
}