package Java;

public class HotDrinksWithTemperature extends HotDrinks { // это наследуемый класс
    private int temperature; // у него есть температура

    public HotDrinksWithTemperature(String name, int volume, int temperature){
        super(name, volume); // имя и объем наследуется от родителя
        this.temperature=temperature; // температура своя
}


public int getTemperature(){
    return temperature;
}

public void setTemperature(int temperature){
    this.temperature=temperature;
}

}
