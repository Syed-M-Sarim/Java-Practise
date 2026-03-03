import java.util.*;

public class practise {

    public static void helloWorld(String name) {
        System.out.println("Welcome! " + name);
      }

    public static int square(int number1, int number2){
        return number1*number2;
    }

    public static void main(String[] args) {
        helloWorld("Sarim");
        int result = square(10,5);
        System.out.println("Square is: " + result);
    }
}