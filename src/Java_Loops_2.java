import java.util.*;
import java.io.*;

public class Java_Loops_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                int k=0;
                int somme=a;
                while(k != j+1){
                    somme+=Math.pow(2,k)*b;
                    k++;
                }
                System.out.print(somme+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
