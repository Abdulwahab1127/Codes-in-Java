import java.util.*;

public class Lab1_Task8 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int rev,ans;

        System.out.printf("Enter a Number to find Reverse:");
        rev = scn.nextInt();

        while(rev>0){

            ans = rev%10;
            System.out.print(ans);
            rev = rev/10;

        }


    }


}
