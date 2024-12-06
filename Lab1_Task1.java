import java.util.Scanner;

public class Lab1_Task1 {

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);


        int roll_number,marks;
        double GPA = 3.30;
        double CGPA = 2.90;
        char SectionA = 'A';
        //char SectionB = 'B';
        String gender="Male";

        System.out.println("Assignment 1 Marks: ");
        System.out.println("Enter The Roll Number of Student : ");
        roll_number = scn.nextInt();

        System.out.println("Enter The Marks of Student : ");
        marks = scn.nextInt();
        System.out.println("Roll Number : " +roll_number +"\nMarks: "+marks);
        System.out.println("Section of Student : "+SectionA);

        System.out.println("GPA of Student :"+GPA);
        System.out.println("CGPA of Student :"+CGPA);

        if (gender == "Male"){
            System.out.println("GENDER : TRUE");
        }else {
            System.out.println("GENDER : FALSE");
        }









    }

}
