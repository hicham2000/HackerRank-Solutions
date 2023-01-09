import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Subarray {
    public static void main(String[] args) {
        int sum=0;
        int tem=0;
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<len;i++){
            arr.add(scanner.nextInt());
        }
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                tem+= arr.get(j);
                if(tem<0)sum++;
            }
            tem=0;
        }
        System.out.println(sum);

    }
}