import java.util.Scanner;
public class Atm{
	public static void main(String[] args) {
		int balance =5000, withdraw, deposit;

		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("**Automated Teller machine**");
			System.out.println("1. withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Choose the option you went to perform:");
			
			int choice =sc.nextInt();
			switch(choice){
				case 1:
				System.out.println("Enter the money to withdraw:" );
				withdraw =sc.nextInt();

				if(balance >= withdraw){
					balance = balance - withdraw;
					System.out.println("Plase collect your money");
				}else{
					System.out.println("Insufficiend Balance");
				}
				System.out.println("");
				break;
				case 2:
				System.out.println("Enter Money to be Deposite:");
				deposit =sc.nextInt();

				balance = balance + deposit;
				System.out.println("Your Money has been Successfully Deposited");
				System.out.println("");
				break;
				case 3:
				System.out.println("Balance:"+balance);
				System.out.println("");
				break;
				case 4:
				System.exit(0);
				default:
				System.out.println("Invalid choice");
			}

		}
	}
}