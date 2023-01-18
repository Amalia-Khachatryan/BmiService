public class BmiService {
    public double calculator(double weightKg, double heightCentimeter) {
        double heightMetre = heightCentimeter / 100;
        double bodyMassIndex = weightKg / Math.pow(heightMetre, 2);
        return bodyMassIndex;
    }
}
