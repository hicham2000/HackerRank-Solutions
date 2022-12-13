import java.math.BigDecimal;
import java.util.*;
public class Java_BigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        String tmp;
        for(int i=0;i<n;i++){

            BigDecimal a = new BigDecimal(s[i]);
            BigDecimal b = new BigDecimal(s[i+1]);
            if (a.compareTo(b) < 0){
                tmp=s[i];
                s[i]=s[i+1];
                s[i+1]=tmp;
            }
        }




        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
