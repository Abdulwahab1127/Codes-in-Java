import java.util.Scanner;

public class Lab2_Task4 {
    public static void main(String[] args) {

        BankAccount bnkacc = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Name of BankAccount Holder:");
        bnkacc.Name = input.nextLine();
        System.out.print("Enter The Balance of BankAccount Holder:");
        bnkacc.Balance = input.nextInt();


        while(true) {
            //MENU
            System.out.print("Press 1: To Deposit an amount\n" +
                    "Press 2: To Withdraw an amount\n" +
                    "Press 3: To View the current balance\n");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter Amount You Want to Deposit ");
                double dep = input.nextInt();

                bnkacc.deposit(dep);
                System.out.println("Deposit Done!");
            }
            else if (choice == 2) {
                System.out.print("Enter Amount You Want to Withdraw ");
                double wdraw = input.nextInt();

                if (bnkacc.checkBalance() >= wdraw){

                    bnkacc.withdraw(wdraw);
                    System.out.println("Cash WithDraw Done!\n");
                }
                else {
                    System.out.println("Balance is Low!!\n");
                }

            } else if (choice == 3) {

                System.out.println("Total Balance is " + bnkacc.checkBalance()+"\n");

            }

        }

    }
}
class BankAccount{
    double Balance;
    String Name;

    public double checkBalance() {
        return Balance;
    }

    public void deposit(double amount) {
        Balance += amount;
    }

    public void withdraw(double amount) {
        Balance -= amount;
    }

}