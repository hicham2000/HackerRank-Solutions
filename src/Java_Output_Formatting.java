import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            if(s1.length()<=10){


                if(x<10){
                    System.out.print(s1);
                    for(int j=0;j<15-s1.length();j++){
                        System.out.print(" ");
                    }
                    System.out.println("00"+x);
                }
                if(x>=10 && x<99){
                    System.out.print(s1);
                    for(int j=0;j<15-s1.length();j++){
                        System.out.print(" ");
                    }
                    System.out.println("0"+x);
                }
                else if(x>=100 && x<=999) {
                    System.out.print(s1);
                    for(int j=0;j<15-s1.length();j++){
                        System.out.print(" ");
                    }
                    System.out.println(x);
                }
            }
            //Complete this line
        }
        System.out.println("================================");

    }
}
