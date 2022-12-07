import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data;
        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNext()){
            data = scanner.nextLine();
            list.add(data);
        }

        for(int i=0 ; i<list.size();i++){
            System.out.println(i+1+" "+list.get(i));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }
}
