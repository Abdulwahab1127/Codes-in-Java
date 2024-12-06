import java.util.Scanner;
public class Lab2_Task2 {
    public static void main(String[] args) {
        Circle cr = new Circle();
        Scanner scn = new Scanner(System.in);

        System.out.printf("Enter The Value of Radius:");
        cr.radius = scn.nextFloat();

        System.out.println("The Radius is = "+cr.radius);
        cr.calculateArea();
        cr.CalculatePari();

    }
}

class Circle{

    float radius;

    public void calculateArea(){
        float area;
        area= (float) (3.14*radius*radius);
        System.out.println("The Area is = "+area);
    }
    public void CalculatePari(){
        float peri;
        peri= (float) (3.14*2*radius);
        System.out.println("The Perimeter is = "+peri);
    }

}
