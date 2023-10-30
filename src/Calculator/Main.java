package Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = 7.7 ;
        double num2 = 5.5 ;
        Calculator c = new Calculator();

        System.out.println("Результат операции: "+ c.add(new Complex(num1, 0), new Complex(num2, 0)));
    }


}
