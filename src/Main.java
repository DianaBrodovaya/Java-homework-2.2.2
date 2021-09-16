public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 69;
        double height = 1.7;
        double bmi = service.calculate(weight, height);
        bmi = Math.round(bmi * 100) / 100d;
        System.out.println("Индекс массы тела = " + bmi);
    }
}
