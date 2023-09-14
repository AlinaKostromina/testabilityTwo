public class BmiService {
    public int calculate(float weightKg, float heightMeter) {
        float bmiIndex = weightKg / (heightMeter * heightMeter);

        return (int) bmiIndex;
    }
}
