import java.util.*;

public class printNameNTimes {
    static void printName(int i, int n){
          if(i>n){
            return;
          }
          System.out.println("Dhanush");
          printName(i+1, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(1,n);
    }
}
