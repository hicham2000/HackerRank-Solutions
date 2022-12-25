//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class Java_Map {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            map1.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(map1.get(s) != null){
                System.out.println(s+"="+map1.get(s));
            }
            else{
                System.out.println("Not found");
            }


        }







    }
}
