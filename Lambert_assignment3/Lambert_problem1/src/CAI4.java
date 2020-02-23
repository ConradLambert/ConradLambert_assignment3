package src;
import java.util.* ;
public class CAI4 {
	
	
	public static int generateQuestionArgument(int level){
		int x = 0;
		if (level ==1)
		 x = (int) (Math.random()*(9-0));
		
		else if (level == 2)
			 x = (int) (Math.random()*(99-0));
		
		else if (level == 3)
			 x = (int) (Math.random()*(999-0));
		
		else if (level == 4)
			 x = (int) (Math.random()*(9999-0));
		
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
		System.out.println("You score was " + x*10 + "%");
		if (x > 7)
			System.out.println("Wow, incredible!\n");
		else
			System.out.println("Please review the material and try again!\n");
	}
	
	public static int readDifficulty() {
		System.out.println("Please enter a difficulty level 1, 2, 3, or 4");
		Scanner scan = new Scanner(System.in);
	    int level = scan.nextInt();
		return level;
	}
	
	public static void quiz() {
		int correctans = 0;
		int level = readDifficulty();
		
		for(int i =0; i < 10; i++) {
		int x, y, ans, usernum;
		x = generateQuestionArgument(level);
		y = generateQuestionArgument(level);
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
		
		System.out.println("Would you like to try again?\n1 for yes\n2 for no");
		Scanner scan = new Scanner(System.in);
		level = scan.nextInt();
		
		if(level==1)
			quiz();
		else
			System.exit(0); 
	}
	public static void main(String[] args) {
		quiz();
	}

}