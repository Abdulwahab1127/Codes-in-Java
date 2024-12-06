import java.util.Scanner;

public class Lab4_Task4 {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      //Taking Count of Student
      System.out.printf("Enter The Number Of Courses You Studied:");
      int input = scn.nextInt();
      System.out.println();

      //Creating Array for courses

      int [] courses = new int[input];

      Coursee course = new Coursee();

      //Taking Input from User
      for (int i=0;i<input;i++){

         System.out.printf("\nEnter Data For %d Student: \n", i+1);

         System.out.printf("Enter The CourseID:");
         course.setCourseCode(scn.next());
         System.out.printf("Enter The CourseTitle:");
         course.setCourseTitle(scn.next());
         System.out.printf("Enter The CourseCreditHr:");
         course.setCourseCreditHr(scn.nextInt());

      }

      //printing Data of Students

      for (int i=0;i<input;i++){
         System.out.println();
         System.out.printf("Data of Student %d:\n",i+1);
         System.out.println("Course Code = "+course.getCourseCode());
         System.out.println("Course Title = "+course.getCourseTitle());
         System.out.println("Course CreditHr = "+course.getCourseCreditHr());
      }


   }


}

//Creating Class For Courses
   class Coursee {

      private String  courseCode;
      private String courseTitle;
      private int courseCreditHr;

      //Making Setter Getters For Private Attributes

      public void setCourseCode(String courseCode) {
         this.courseCode = courseCode;
      }
      public String getCourseCode() {
         return courseCode;
      }

      public void setCourseTitle(String courseTitle) {
         this.courseTitle = courseTitle;
      }
      public String getCourseTitle() {
         return courseTitle;
      }

      public void setCourseCreditHr(int courseCreditHr) {
         this.courseCreditHr = courseCreditHr;
      }
      public int getCourseCreditHr() {
         return courseCreditHr;
      }

   }
