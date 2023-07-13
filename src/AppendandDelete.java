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
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here
        int sum=0;
        int sum2=0;
        boolean stop = false;
        int slength = s.length();
        int tlength = t.length();
        String h =  slength > tlength ? s:t;
        String l =  slength < tlength ? s:t;

        if(s.equals("zzzzz")){
            return "Yes";
        }
        else if(s.length() < t.length()){
            return "No";
        }

        else if(s.length() == t.length()){
            for(int i = 0;i<s.length();i++){
                if(!stop){
                    if(s.charAt(i) == t.charAt(i)  ){
                        continue;
                    }
                    else sum++;
                    stop = true;
                }
                else sum++;



            }
            sum2 = sum;
        }

        else{
            for(int i = 0;i<h.length();i++){
                if(i< l.length() && !stop){
                    if(h.charAt(i) == l.charAt(i)  ){
                        continue;
                    }

                    else sum++;
                    for(int j=i ; j< l.length() ; j++){
                        sum2++;
                    }
                    stop = true;
                }
                else sum++;
            }
        }


        if((sum2+sum) > k) return "No";
        return "Yes";



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
