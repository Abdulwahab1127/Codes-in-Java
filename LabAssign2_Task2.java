import java.util.Scanner;

public class LabAssign2_Task2 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

        //Taking Input From User
        System.out.println("Enter Student Name:");
        String name = scn.nextLine();
        System.out.println("Enter Student Email:");
        String email = scn.nextLine();
        System.out.println("Enter Student CNIC:");
        String cnic= scn.nextLine();

        System.out.println("Enter PhoneNumber Details:");
        System.out.println("Enter Country Code:");
        int ccode = scn.nextInt();
        System.out.println("Enter City Code:");
        int citycode = scn.nextInt();
        System.out.println("Enter Line Number:");
        int Linenum = scn.nextInt();

        PhoneNumber contactNumber = new PhoneNumber(ccode,citycode,Linenum);

        Student student1 = new Student(name,cnic,contactNumber);
        student1.setEmail(email);

        //Taking Input for CourseList Here
        System.out.println("Enter How Many Courses You want to Add:");
        int Limit = scn.nextInt();
        Course[] courseList = new Course[Limit];

        //Taking Leftover input Here to Avoid input-Errors
        scn.nextLine();

        for (int i=0;i<Limit;i++)
        {
            System.out.println("Course : "+(i+1));

            System.out.println("Enter Course Code :");
            String courseC  = scn.nextLine();
            System.out.println("Enter Course Title:");
            String courseT = scn.nextLine();
            System.out.println();

            courseList[i] = new Course(courseC,courseT);

        }
        student1.setCourseList(courseList);
        student1.displayInfo();

        //Printing CourseList Array Here

        for (int i=0;i<Limit;i++){

            System.out.println("Course: "+(i+1));
            System.out.println("Course Code: "+student1.getCourseList()[i].getCourseCode());
            System.out.println("Course Title: "+student1.getCourseList()[i].getCourseTitle());


        }

    }


}


class Course{
    private String courseCode;
    private String courseTitle;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    //Making Constructor Here of Courses

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }
}

class PhoneNumber{
    private int countryCode;
    private int cityCode;
    private int lineNumber;


    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    //Making a Constructor Here for class PhoneNumber
    public PhoneNumber(int countryCode, int cityCode, int lineNumber) {
        this.setCountryCode(countryCode);
        this.setCityCode(cityCode);
        this.setLineNumber(lineNumber);
    }


}
class Student {
    private String Name;
    private String Email;
    private String CNIC;
    private Course[] courseList;
    private PhoneNumber contactNumber;

    //Making Constructor Here with 3 Attributes

    public Student(String name, String CNIC, PhoneNumber contactNumber) {
        Name = name;
        this.CNIC = CNIC;
        this.contactNumber = contactNumber;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public Course[] getCourseList() {
        return courseList;
    }

    public void setCourseList(Course[] courseList) {
        this.courseList = courseList;
    }

    public PhoneNumber getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(PhoneNumber contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void displayInfo(){

        System.out.println("Student Name: "+Name);
        System.out.println("Student Email: "+Email);
        System.out.println("Student CNIC: "+CNIC);
        System.out.println("Student Phone Number: "
                            +contactNumber.getCountryCode()
                            +"-"+contactNumber.getCityCode()
                            +"-"+contactNumber.getLineNumber());


    }

}
