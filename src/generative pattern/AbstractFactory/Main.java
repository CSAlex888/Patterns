package AbstractFactory;

public class Main {
    public static void main(String[] args) {

        FanFactory youngFactory = new YoungFanFactory();
        FanFactory oldFactory = new OldFanFactory();
        FanFactory sasenFactory = new SasenFanFactory();

        Yaoi youngYaoi = youngFactory.createYaoi();
        Yori youngYori = youngFactory.createYori();
        Get youngGet = youngFactory.createGet();

        Yaoi oldYaoi = oldFactory.createYaoi();
        Yori oldYori = oldFactory.createYori();
        Get oldGet = oldFactory.createGet();

        Yaoi sasenYaoi = sasenFactory.createYaoi();
        Yori sasenYori = sasenFactory.createYori();
        Get sasenGet = sasenFactory.createGet();

        System.out.println("Young Group:");
        System.out.println("  " + youngYaoi.getType());
        System.out.println("  " + youngYori.getType());
        System.out.println("  " + youngGet.getType());

        System.out.println("Old Group:");
        System.out.println("  " + oldYaoi.getType());
        System.out.println("  " + oldYori.getType());
        System.out.println("  " + oldGet.getType());

        System.out.println("Sasen Group:");
        System.out.println("  " + sasenYaoi.getType());
        System.out.println("  " + sasenYori.getType());
        System.out.println("  " + sasenGet.getType());
    }
}
