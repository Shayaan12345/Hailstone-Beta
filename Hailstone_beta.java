import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;
 

public class Hailstone_beta {
    public static void main(String args[]){
        long y;
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int x = scanner.nextInt();
        if(x % 2==0){
            y = x/2;
            
            System.out.print(y);
            System.out.print("       ");
          }
        else{
            y = (x * 3) + 1;
            
            System.out.print(y);
            System.out.print("       ");
        }
        
     }
     
    
    }
}
