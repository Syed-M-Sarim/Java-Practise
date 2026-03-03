import java.util.*;

public class practise {

    public static void helloWorld(String name) {
        System.out.println("Welcome! " + name);
      }

    public static int square(int number){
        return number*number;
    }

    public static void main(String[] args) {
        helloWorld("Sarim");
        int result = square(10);
        System.out.println("Square is: " + result);
    }
}