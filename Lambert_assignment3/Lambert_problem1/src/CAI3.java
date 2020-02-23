package src;
import java.util.* ;
public class CAI3 {
	
	
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
		int random = (int) (Math.random()*(9-1));
			System.out.println(random);
	}

	public static void displayIncorrectResponse() {
		int random = (int) (Math.random()*(-1-9));
			System.out.println(random);
	}
	
	public static void displayCompletionMessage(int x) {
		System.out.println("You score was" + x*10 + "%");
		if (x > 7)
			System.out.println("Wow, incredible!\n");
		else
			System.out.println("Please review the material and try again!\n");
	}
	
	public static void quiz() {
		int correctans = 0;
		for(int i =0; i < 10; i++) {
		int x, y, ans, usernum;
		x = SecureRandom();
		y = SecureRandom();
		ans = x * y;
	
		askQuestion(x, y);
		usernum = readResponse();
		
		int response = isAnsCorrect(ans, usernum);
		
		if( response != 1) {
			displayIncorrectResponse();
		}
		
		else {
			displayCorrectResponse();
			correctans++;
		}
		
		}
		
		displayCompletionMessage(correctans);
	}
	public static void main(String[] args) {
		quiz();
	}

}