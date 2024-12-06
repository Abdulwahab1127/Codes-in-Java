import java.util.*;

public class Lab1_Task7 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number to Find Factorial ");
        int num = scn.nextInt();
        int fac = 1;
        for (int i=1 ; i<=num ; i++){

           fac*=i;

        }

        System.out.println("The Factorial of Given Num  is "+fac);


    }

}
