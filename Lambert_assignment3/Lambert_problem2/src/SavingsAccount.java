package src;
import java.util.* ;
public class SavingsAccount {
	
	private static double annualInterestRate = 0.04;
	private static double balance;
	
	public static double calculateMonthlyInterest(double annualInterestRate, double balance2) {
		double monthly= annualInterestRate*balance2/12; 
		monthly = monthly + balance2;
		System.out.print(monthly+ "\n");
		return monthly;
	}
	
	public static double modifyInterestRate(double annualInterestRate) {
		annualInterestRate = 0.05;	
		return annualInterestRate;
	}
	
	public static void SavingsAccountTest() {
		int i;
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.balance = 2000;
		saver2.balance = 3000;
		
		System.out.println("Here are the balances after one year with an interest rate of 4%\n");
		for( i = 0; i < 12; i++) {
		saver1.balance = calculateMonthlyInterest(annualInterestRate, saver1.balance);
		}
		
		for( i = 0; i < 12; i++) {
			saver2.balance = calculateMonthlyInterest(annualInterestRate, saver2.balance);
			}
		
		annualInterestRate = modifyInterestRate(annualInterestRate);
		
		System.out.println("Here are the balances after one year with an interest rate of 5%\n");
		
		for(i = 0; i < 12; i++) {
			saver1.balance = calculateMonthlyInterest(annualInterestRate, saver1.balance);
			}
			
		for(i = 0; i < 12; i++) {
			saver2.balance = calculateMonthlyInterest(annualInterestRate, saver2.balance);
			}
		
	}
	public static void main(String[] args) {
	SavingsAccountTest();
	}

}

