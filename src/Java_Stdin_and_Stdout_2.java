import java.util.Scanner;

public class Java_Stdin_and_Stdout_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
