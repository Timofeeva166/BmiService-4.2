public class BmiService {

    public int calculate(double WeightKg, double HeightMeters) {
        double result;
        result = WeightKg / (HeightMeters * HeightMeters);
        int index = (int) result;
        return index;
    }
}
