import java.util.*;
public class TestDate{

	public static void main(String args[]){
	
		Scanner Scn = new Scanner(System.in);
		
		Datee dt1 = new Datee();
		
		Datee dt2 = new Datee();
		
		System.out.print("Enter The Day Here : ");
		int day = Scn.nextInt();
		dt1.setDay(day);
		 
		System.out.print("Enter month: ");
		int month = Scn.nextInt();
		dt1.setMonth(month)	;
		dt1.setYear(2023);
	 
		 Datee dt3;
		 Datee dt4;
		 
		 dt3 = dt1;
		 dt4 = dt3;
		 
		 
		 dt1.DisplayDate();
		 dt2.DisplayDate();
		 dt3.DisplayDate();
		 dt4.DisplayDate();
	
	}
	
}


class Datee {

	private int Day;
	private int Month;
	private int Year;
	
	
	
	//No arguments Constructor
	public Datee(){
		
		this.Day = 14;
		this.Month= 3;
		this.Year = 2023;	
		
	}

	//Arguments Constructor
	public Datee(int day, int month, int year){
		
		setDay(day);
		setMonth(month);;
		setYear(year);	
		
	}	
	
	//Making Setters With Condition
	public void setDay(int day) {
        if (day > 12) {
            this.Day = 1;
        } else {
            this.Day = day;
        }
    }
	public void setMonth(int month) {
        if (month > 12) {
            this.Month = 1;
        } else {
            this.Month = month;
        }
    }
	
	public void setYear(int year) {
		this.Year = year;
	
	}
	//Making Getter Here
	public int getDay(){
		return Day;
	}	
	
	public int getMonth(){
		return Month;
	}
	
	public int getYear(){
		return Year;
	}


	public void DisplayDate() {
        System.out.printf("\n%02d/%02d/%02d", this.Day, this.Month, this.Year );
    }


}	