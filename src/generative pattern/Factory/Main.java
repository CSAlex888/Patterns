package Factory;

public class Main {
    public static void main(String[] args) {
        Fan youngFan = FanFactory.createFan(FanType.YOUONG);
        Fan oldFan = FanFactory.createFan(FanType.OLD);
        Fan shipFan = FanFactory.createFan(FanType.SHIP);
        Fan sasenFan = FanFactory.createFan(FanType.SASEN);
        Fan invalidFan = FanFactory.createFan(null);

        if (invalidFan == null) {
            System.out.println("Invalid");
        }

        // 3. Вызываем методы у объектов
        if (youngFan != null) {
            System.out.println("Created: "+youngFan.getType());
        }
        if (oldFan != null) {
            System.out.println("Created: "+oldFan.getType());
        }
        if (shipFan != null) {
            System.out.println("Created: "+shipFan.getType());
        }
        if (sasenFan != null) {
            System.out.println("Created: "+sasenFan.getType());
        }
    }
}
