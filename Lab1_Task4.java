import java.util.Scanner;

public class Lab1_Task4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number;

        System.out.println("Enter Any Number to Check if it's Positive of Negative");
        System.out.printf("Enter a Number : ");
        number = scn.nextInt();

        if(number < 0){
            System.out.println("The Number "+number+" is a Negative Number!");
        }else {
            System.out.println("The Number "+number+" is a Positive Number!");
        }


    }

}
