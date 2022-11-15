public class Converter {
    public double distance_V_Metrah(int distance) {
        double distanceMetr = distance * 0.75 / 1000;
        return distanceMetr;
    }

    public double caloriesBerned(int distance) {

        double calories = distance * 50 / 1000;
        return calories;
    }
}
