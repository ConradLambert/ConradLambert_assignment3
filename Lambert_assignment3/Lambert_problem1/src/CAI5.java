package src;
import java.util.* ;
import java.security.SecureRandom;
public class CAI5 {
	
	
	public static int SecureRandom() {
		SecureRandom randomnumber = new SecureRandom();
		int x = randomnumber.nextInt(10);
		return x;
	}
	
	public static int generateQuestionArgument(int level){
		int x = 0;
		if (level ==1)
		 x = SecureRandom();
		
		else if (level == 2)
			x = SecureRandom();		
		
		else if (level == 3)
			
			x = SecureRandom();		
		else if (level == 4)
			
			x = SecureRandom();		
		return x;
	}
	
	public static void askQuestion(int x, int y, int TypeOfProblem) {
		if(TypeOfProblem == 1) {
		System.out.printf("What is " +  x); 
		System.out.printf (" plus " +  y);
	}
		else if (TypeOfProblem == 1) {
			System.out.printf("What is " +  x); 
			System.out.printf (" minus " +  y);
		}
		else if (TypeOfProblem == 1) {
			System.out.printf("What is " +  x); 
			System.out.printf (" times " +  y);
		}
		else {
				System.out.printf("What is " +  x); 
				System.out.printf (" divided by " +  y);
			}	
	
	}
	
	public static int readResponse(){
		
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		
		return b;
	}
	
	public static int isAnsCorrect(double ans, double usernum) {
		if (ans == usernum) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public static void displayCorrectResponse() {
		int random = SecureRandom();
			System.out.println(random);
	}

	public static void displayIncorrectResponse() {
		int random = (int) SecureRandom();
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
	
	public static int typeofproblem() {
		System.out.println("Please select which operation you would like to study\n1: Addition\n2: Subtraction\n3:Multiplication\n4:Division(For division, please round numbers to four decimal places)\n5: ???");
		Scanner scan = new Scanner(System.in);
		int TypeOfProblem = scan.nextInt();
		return TypeOfProblem;
	}
	
	public static double ProblemType(int TypeofProblem, int x, int y) {
		double ans=0;
		if (TypeofProblem == 1)
			ans = x + y;
		if (TypeofProblem == 2)
			ans = x - y;
		if (TypeofProblem == 3)
			ans = x * y;
		if (TypeofProblem == 4)
			ans = x / y;
		return ans;
	}
	
	
	public static void quiz() {
		int correctans = 0;
		int TypeOfProblem = typeofproblem();
		int level = readDifficulty();
		
		for(int i =0; i < 10; i++) {
		int x, y;
		double ans, usernum;
		x = generateQuestionArgument(level);
		y = generateQuestionArgument(level);
		ans = ProblemType(TypeOfProblem, x, y);
	
		askQuestion(x, y, TypeOfProblem);
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