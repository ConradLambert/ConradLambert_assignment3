package src;
import java.util.* ;
public class CAI1 {
	
	
	public static int SecureRandom(){
		
		int x = (int) (Math.random()*(9-0));
		return x;
	}
	
	public static void askQuestion(int x, int y) {
		System.out.printf("What is " +  x); 
		System.out.printf (" times " +  y);
	}
	
	public static int readResponse(){
		
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		
		return b;
	}
	
	public static int isAnsCorrect(int ans, int usernum) {
		if (ans == usernum) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very good!");
	}

	public static void displayIncorrectResponse() {
		System.out.println("No, please try again\n!");
	}

	public static void quiz() {
		int x, y, ans, usernum;
		x = SecureRandom();
		y = SecureRandom();
		ans = x * y;
	
		askQuestion(x, y);
		usernum = readResponse();
		
		int response = isAnsCorrect(ans, usernum);
		while( response != 1) {
			displayIncorrectResponse();
		usernum = readResponse();
		response = isAnsCorrect(ans, usernum);
		}
		
		if (response == 1) {
			displayCorrectResponse();
		}
		
		
		
	}
	public static void main(String[] args) {
		quiz();
	}

}
