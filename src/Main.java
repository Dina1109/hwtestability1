// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightmetr = 1.54;
        int weight = 62;
        double index = service.calculate(heightmetr, weight);
        int bmi = (int)index;
        System.out.println("Индекс массы тела = " +bmi);
    }
}