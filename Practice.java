import java.util.*;

public class Practice {

        static void myMethod(String name, int age) {
            System.out.println(name + " is " + age +" Years Old.");
        }

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);

            System.out.println("Enter First Person Name: ");
            String Name1 = scn.nextLine();
            System.out.println("Enter First Person Age: ");
            Integer Age1 = scn.nextInt();

            myMethod(Name1,Age1);
           // myMethod("Jenny", 8);
            // myMethod("Anja", 31);
        }
    }


