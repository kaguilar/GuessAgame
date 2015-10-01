import java.util.Scanner;

		public class GuessAnumber {
	
	public static void main(String[] args) {
		int rand;
		int userNum;
		
		Scanner input = new Scanner(System.in);
		System.out
			.print("Think of a number from 1 to 10");
	
			     int randNum , guessNum ;
			    
			     randNum = new java.util.Random().nextInt(10) + 1;

			  for (guessNum = 0; guessNum <= 10; guessNum ++){

			      java.util.Scanner scan = new java.util.Scanner(System.in);
			      guessNum = scan.nextInt();

			      if (guessNum == randNum) {
			           System.out.println("you guessed " + guessNum );
			    }
			  } 
			}
			}

