import java.util.*;
public class practise {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to stop at: ");
        int range = sc.nextInt();
      for (int i=1; i<=range; i++){
        if (i == 10){
            System.out.println(i +" "+"Break point");
            break;
        }
        System.out.println(i);
      }
      sc.close();
    }
}
