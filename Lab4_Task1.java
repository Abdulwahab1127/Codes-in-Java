public class Lab4_Task1 {

    public static void main(String[] args) {

      SavingsAccount Saver1 = new SavingsAccount(2000);
      SavingsAccount Saver2 = new SavingsAccount(3000);

      Saver1.calculateMonthlyInterest();
      Saver2.calculateMonthlyInterest();

        System.out.println("Saver 1 Monthly Balance : "+Saver1.getSavingBalance() );
        System.out.println("Saver 2 Monthly Balance : "+Saver2.getSavingBalance() );

      SavingsAccount.modifyIR(3);

      Saver1.calculateMonthlyInterest();
      Saver2.calculateMonthlyInterest();

        System.out.println("Changing Annual Interest Rate to 3");
        System.out.println("Saver 1 Monthly Balance : "+Saver1.getSavingBalance() );
        System.out.println("Saver 2 Monthly Balance : "+Saver2.getSavingBalance() );

      SavingsAccount.modifyIR(4);

      Saver1.calculateMonthlyInterest();
      Saver2.calculateMonthlyInterest();

        System.out.println("Changing Annual Interest Rate to 4");
        System.out.printf("Saver 1 Monthly Balance : %.2f \n",Saver1.getSavingBalance() );
        System.out.println("Saver 2 Monthly Balance : "+Saver2.getSavingBalance() );

    }


}

class  SavingsAccount{

    public static float AnnualInterestRate;
     private float SavingBalance;

    //Getters For Private Attributes
     public static float getAnnualInterestRate() {
        return AnnualInterestRate;
    }
     public float getSavingBalance() {
        return SavingBalance;
    }

    //Constructor
    public SavingsAccount(float balance){

        SavingBalance = balance;

    }

    //Calculating Monthly Interest
    public void calculateMonthlyInterest(){

    float MonthlyInterest = SavingBalance * (AnnualInterestRate/12);

    SavingBalance = SavingBalance + MonthlyInterest;

    }

    //Modifying Interest Rates
    public static void modifyIR (float newIR){

        AnnualInterestRate = newIR;

    }

}
