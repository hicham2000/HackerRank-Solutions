import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Exception_Handling_Trycatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try{
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int c=x/y;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}
