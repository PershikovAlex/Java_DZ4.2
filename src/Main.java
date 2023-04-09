public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();

    System.out.println("Индекс массы тела: " + service.calculate(98, 1.87));

    System.out.println("Индекс массы тела: " + service.calculate(100, 1.67));

    System.out.println("Индекс массы тела: " + service.calculate(75, 1.99));
    }
}