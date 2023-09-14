public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 70.1F;
        float heightMeter = 1.83F;
        int bmi = service.calculate(weightKg, heightMeter);
        System.out.println(bmi);
    }
}