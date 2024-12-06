import java.util.Scanner;
public class TestBankAccount{

	public static void main(String args[]){
	
		Scanner scn = new Scanner(System.in);
		BankAccount bankk = new BankAccount();
		
		System.out.printf("Enter The Title Of The Account (Name):");
		String Name = scn.nextLine();
		bankk.setName(Name);
	
		System.out.printf("Enter The Number Of The Account Holder:");
		int num = scn.nextInt();
		bankk.setNumber(num);
		
		
		System.out.printf("Enter The Balance Of The Account Holder:");
		int blnc = scn.nextInt();
		bankk.setBalance(blnc);
		
		
		
		System.out.println("\nAccount Number = "+ bankk.getNum());	
		System.out.println("\nAccount Title = " +bankk.getName());
		System.out.println("\nAccount Balance = " +bankk.getBalance());
	
	}

}

class BankAccount{
	
	private int accountNumber;
	private String accountTitle;
	private int Balance;
	
	
	public void setName(String Name){
		
		this.accountTitle = Name;
	}
	public String getName(){
		
		return accountTitle;
	}
	
	
	public void setNumber(int num){
		
		this.accountNumber = num;
	}
	public int getNum(){
		
		return accountNumber;
	}
	
	
	public void setBalance(int blnc){
		
		this.Balance = blnc;
	}
	public int getBalance(){
	
		return Balance;
	}
	
	
	
	
}








