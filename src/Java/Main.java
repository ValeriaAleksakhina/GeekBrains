package Java;

public class Main {
    public static void main(String[] args) {
        HotDrinksWithTemperature hotDrinksWithTemperature1 = new HotDrinksWithTemperature("Tea", 200, 80);
        HotDrinksWithTemperature hotDrinksWithTemperature2 = new HotDrinksWithTemperature("Coffe", 50, 75);
        HotDrinksWithTemperature hotDrinksWithTemperature3 = new HotDrinksWithTemperature("HotWater", 100, 90);


        HotDrinksAutomat hotDrinksAutomat = new HotDrinksAutomat();
        hotDrinksWithTemperature1 = hotDrinksAutomat.getProduct("Tea", 200, 80);
        hotDrinksWithTemperature2 = hotDrinksAutomat.getProduct("Coffe", 50, 75);
        hotDrinksWithTemperature3 = hotDrinksAutomat.getProduct("HotWater", 100, 90);


    }
}
