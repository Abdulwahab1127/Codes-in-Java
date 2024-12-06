import java.util.Scanner;

public class Lab2_Task3 {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Scanner scn = new Scanner(System.in);

        System.out.printf("Enter The Length :");
        rec.length = scn.nextInt();
        System.out.printf("Enter The Width :");
        rec.width = scn.nextInt();

        System.out.println("The Length is = "+rec.length);
        System.out.println("The Width is = "+rec.width);

        rec.calculateArea();
        rec.CalculatePari();

    }
}

class Rectangle{

    int length,width;

    public void calculateArea(){
        float area;
        area= (float) (length*width);
        System.out.println("The Area is = "+area);
    }
    public void CalculatePari(){
        float peri;
        peri= (float) (length+length+width+width);
        System.out.println("The Perimeter is = "+peri);
    }

}

