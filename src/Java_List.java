import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_List {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            list.add(scanner.nextInt());
        }
        int Q=scanner.nextInt();
        String q;
        int x,y;
        for(int i=0;i<Q;i++){
            q=scanner.next();
            if(q.equals("Insert")){
                x=scanner.nextInt();
                y=scanner.nextInt();
                list.add(x,y);
            }
            else if(q.equals("Delete")){
                x=scanner.nextInt();
                list.remove(x);
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }


    }
}
