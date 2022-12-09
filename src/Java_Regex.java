import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Java_Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//Write your code here

class MyRegex{

    String num = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}







