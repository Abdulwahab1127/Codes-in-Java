import java.util.Scanner;

public class Lab4_Task3 {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    System.out.printf("Enter The Size Of Your Array:");
    int arr_Size = scn.nextInt();

    //Declaring an Array Here Of Array Size

     int[] arr = new int[arr_Size];

        for(int i=0 ; i<arr_Size;i++){

        System.out.println("Enter The Numbers You want to Store at "+i+":");
        arr [i] = scn.nextInt();

        }

    //Printing All Elements
        System.out.println("Printing Array Here:");
        for (int i=0 ;i< arr_Size;i++){
          System.out.println(arr[i]);
       }

    //Finding Maximum
        int  max = arr[0];
        int maxindex = 0;
        for (int i=0;i<arr_Size;i++){

         if (max < arr[i])
         {
             max = arr[i];
             maxindex = i;
         }

     }
        System.out.println();
        System.out.println("Maximum Value is = "+max);
        System.out.println("Maximum Value index is = "+maxindex);

    //Finding Minimun
        int  min = arr[0];
        int minindex = 0;
        for (int k=0;k<arr_Size;k++){

            if (min > arr[k])
            {
                min = arr[k];
                minindex = k;
            }

        }
        System.out.println();
        System.out.println("Minimun Value is = "+min);
        System.out.println("Minimun Value index is = "+minindex);



    }




}
