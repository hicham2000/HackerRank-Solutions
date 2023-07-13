import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Long> a = new ArrayList<Long>();
        long sum=0;

        for(int i=0 ; i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                sum += arr.get(j);
            }
            a.add(sum-arr.get(i));
            sum = 0;
        }

        long max = a.get(0);
        long min = a.get(0);

        for(int i =1 ; i<a.size(); i++){
            max = a.get(i) > max ? a.get(i) : max;
            min = a.get(i) < min ? a.get(i) : min;
        }
        System.out.println(min + " " + max);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
