import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n;
        int line;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        n=scanner.nextInt();
        for(int i=0; i<n; i++){
            List<Integer> a = new ArrayList<Integer>();
            line = scanner.nextInt();
            for(int j=0; j<line; j++){
                a.add(scanner.nextInt());
            }
            list.add(a);

        }

        int d = scanner.nextInt();

        for(int i = 0; i<d ;i++){
            int q = scanner.nextInt();
            int h = scanner.nextInt();

            if(list.get(q-1).size() < h){
                System.out.println("ERROR!");
            }

            else{
                System.out.println(list.get(q-1).get(h-1));
            }
        }

    }
}