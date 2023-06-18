public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double WeightKg = 98;
        double HeightMeters = 1.87;
        int index = service.calculate(WeightKg, HeightMeters);
        System.out.println(index);
    }
}