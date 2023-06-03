public class BmiService {
    public double calculate(double heightmetr, double weight) {
        double result = weight / (heightmetr * heightmetr);
        return result;
    }
}
