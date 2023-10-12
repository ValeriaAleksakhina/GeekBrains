package Java;


    public class HotDrinksAutomat implements Automat { // Класс Автомат Горячих напитков реализует интерфейс Автомат
        @Override
        public void getProduct() {
        }


        public HotDrinksWithTemperature getProduct(String name, int volume, int temperature) {
            return new HotDrinksWithTemperature(name, volume, temperature);
        }
    }

