package Java;

public class HotDrinks {   // это родительский класс
    private String name; //  у него есть имя
    private int volume; // у него есть объем

    public HotDrinks(String name, int volume) {

        this.name=name;
        this.volume = volume;
    }

    public void setName(String name){  // задать имя напитка
    this.name = name;
    }

    public int getVolume(){ // получить объем напитка
        return volume;
    }
    public void setVolume(int volume){  //задать объем напитка
        this.volume=volume;
    }
}

