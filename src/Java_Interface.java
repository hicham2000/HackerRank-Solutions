import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

//Write your code here

class MyCalculatorr implements AdvancedArithmetic{


    public int divisor_sum(int a){
        int somme=0;
        for(int i=a;i>0;i--){
            if(a%i==0){
                somme+=i;
            }
        }
        return somme;
    }
}


public class Java_Interface {
    public static void main(String []args){
    MyCalculatorr my_calculator = new MyCalculatorr();
        System.out.print("I implemented: ");

    ImplementedInterfaceNames(my_calculator); {
    }

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n)+"\n");
      	sc.close();
}

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
