import java.util.*;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 100;
		Scanner s = new Scanner(System.in);
	while(true) {
		System.out.println("Welcome!");
		System.out.println("Choose 1 to Withdraw");
		System.out.println("Choose 2 to Deposit");
		System.out.println("Choose 3 to Check Balance");
		System.out.println("Choose 4 to Exit");
		System.out.println("Welcome!");
		
		int choice = s.nextInt();
				switch (choice) {
				case 1 :
					System.out.println("Enter withdrawl amount :");
				int	withdraw = s.nextInt();
					if(balance >= withdraw) {
						System.out.println("Dispensing cash...");
					}
						else {
							System.out.println("Insufficient funds");
						}
							System.out.println("");
							break;
							
				case 2 : 	
						System.out.println("Enter amount to be deposited: ");
						int	deposit = s.nextInt();
						balance = deposit + balance;
						System.out.println("Successful deposit!");
						System.out.println("");
						break;
						
				case 3 :
					System.out.println("Your balance is: " + balance);
						break;
				
				case 4 : 
					System.exit(0);
							}
						}
					}
				}
		
		
	


