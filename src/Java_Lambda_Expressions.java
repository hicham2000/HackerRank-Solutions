import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Lambda_Expressions {
    public static boolean isOdd(int a){
        if(a%2 == 0){
            return false;
        }

        return true;


    }

    public static boolean isPrime(int a){
        for(int i=2;i<a;i++){
            if(a%i == 0){
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrome(int a){
        String original = Integer.toString(a);
        String reversed = new StringBuilder(Integer.toString(a)).reverse().toString();
        if(reversed.equals(original)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for(int i=1;i<=t;i++){
            int b = scanner.nextInt();
            int a = scanner.nextInt();
            if(b==1){
                if(isOdd(a)){
                    System.out.println("ODD");
                }
                else{
                    System.out.println("EVEN");
                }
            }
            else if(b==2){
                if(isPrime(a)){
                    System.out.println("PRIME");
                }
                else System.out.println("COMPOSITE");
            }
            else if(b==3){
                if(isPalindrome(a)){
                    System.out.println("PALINDROME");}
                else{ System.out.println("NOT PALINDROME");}
            }


        }
    }
}
