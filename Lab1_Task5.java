import java.util.Scanner;

public class Lab1_Task5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int marks;
        System.out.printf("Enter Marks of The Student :");
        marks = scn.nextInt();

        if(marks >= 90){
            System.out.println("The Student Scored Grade 'A+' ");
        } else if (marks >= 80 && marks < 90 ) {
            System.out.println("The Student Scored Grade 'B' ");
        }else if (marks >= 70 && marks < 80 ) {
            System.out.println("The Student Scored Grade 'C' ");
        }else if (marks >= 60 && marks < 70 ) {
            System.out.println("The Student Scored Grade 'D' ");
        }else if (marks >= 50 && marks < 60 ) {
            System.out.println("The Student Scored Grade 'E' ");
        }else{
            System.out.println("The Student Scored Grade 'F' Better Luck Next Time! ");
        }


    }


}
