import java.io.*;
import java.util.*;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.isEmpty()) {
            System.out.print("0");
            // Output:
        } else if (s.length() < 400000) {
            //split string approach:
            String[] splittedSStrings = s.trim().split("[ !,?._'@]+");

            // 1) length of splitted S
            System.out.println(splittedSStrings.length);

            // 2) print all the strings in splittedSStrings:
            for (String string : splittedSStrings) {
                if (!string.isEmpty()) {
                    System.out.println(string);
                }
            }
        }








        scan.close();
    }
}
