import java.io.*;
import java.util.*;

class Hangman{
	public static void main(String[]args) throws FileNotFoundException {

		Scanner kb = new Scanner(System.in);
		Scanner easyTextFile = new Scanner(new File("t1.txt"));
		Scanner mediumTextFile= new Scanner(new File("t2.txt"));
		Scanner hardTextFile= new Scanner(new File("t3.txt"));
		int easy = 1;
		int medium = 2;
		int hard = 3;
		int level = 0;
		int i = 0;
		int e = 0;
		int a = 0;
		int counter= 0;
		int HangmanCounter=6; 
		int Score = 0;
		int wrongcounter= 0;
		String [] EasyWords= new String[1676];
		String [] MediumWords = new String [1335];
		String [] HardWords = new String[205];
		String word="";
		char c;
		char Guess;
		char mediumGuess;
		char hardGuess;
		char [] CharArray;



		//Welcome messege
		System.out.println("                                    ");  // to add space between each line
		System.out.println("WELCOME TO HANGMAN");
		System.out.println("                                    ");  // to add space between each line
		System.out.println("   |------");
		System.out.println("   O     |");
		System.out.println("  \\|/    |");
		System.out.println("   |     |");
		System.out.println("  / \\    |");
		System.out.println("    _____|");
		System.out.println("                                    ");  // to add space between each line
		System.out.println("Please select your difficulty level to start the game");
		System.out.println("                                    ");  // to add space between each line

		//Menu
		System.out.println(" 1- Easy");
		System.out.println(" 2- Intermediate");
		System.out.println(" 3- Hard");
		level= kb.nextInt();


		// randomly choose a word from the array with the contents of the textfiles
		while (easyTextFile.hasNextLine()){
			EasyWords[i]= easyTextFile.nextLine();
			i++;
		}

		while(mediumTextFile.hasNextLine()){

			 MediumWords[e]= mediumTextFile.nextLine();
			 e++;		 
		}


		while(hardTextFile.hasNextLine()){

			HardWords[a]= hardTextFile.nextLine();
			a++;	
		}


		if (level == easy) {
			word= EasyWords[new Random().nextInt(EasyWords.length)];
			System.out.println("                                    ");  // to add space between each line
			System.out.println("Please enter your guess for your word");
			System.out.println("                                    ");  // to add space between each line
			System.out.println("		  |------");
			System.out.println("		        |");
			System.out.println("		        |");
			System.out.println("		        |");
			System.out.println("		        |");
			System.out.println("		   _____|");
			System.out.println("                                    ");  // to add space between each line

		}

			if(level==medium){
				word= MediumWords[new Random().nextInt(MediumWords.length)];
				System.out.println("                                    ");  // to add space between each line
				System.out.println("Please enter your guess for your word");
				System.out.println("                                    ");  // to add space between each line
				System.out.println("		  |------");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		   _____|");
				System.out.println("                                    ");  // to add space between each line

			}



			if(level==hard){
				word= HardWords[new Random().nextInt(HardWords.length)];
				CharArray = new char[word.length()];
				System.out.println("                                    ");  // to add space between each line
				System.out.println("Please enter your guess for your word");
				System.out.println("                                    ");  // to add space between each line
				System.out.println("		  |------");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		   _____|");
				System.out.println("                                    ");  // to add space between each line

			}

			CharArray = new char[word.length()];
			for (int z = 0; z < word.length(); z++) {
					CharArray[z]= '-';
					System.out.print(CharArray[z] + " ");
				}
			
		



			while(HangmanCounter>0) {
				System.out.println("                                    ");  // to add space between each line
				Guess = kb.next().charAt(0);
				int x = word.indexOf(Guess);
				if ( x>= 0) {
					Score++;
					CharArray[x] = Guess;
					for (int j = 0; j < word.length(); j++) {
						System.out.print(CharArray[j] + " ");
					}
				}

			 	else {
					HangmanCounter--;
			}
	
		 	if(Score == word.length()) {
				System.out.println("                                    ");  // to add space between each line
				System.out.println("You have guessed the word correctly, Well Done :D");
		 		System.out.println("                                    ");  // to add space between each line
				System.exit(0);
		}

			if(HangmanCounter==5){
				System.out.println();
				System.out.println("		  |------");
				System.out.println("		  O     |");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		        |");
				System.out.println("		   _____|");
			}

			if(HangmanCounter==4){
				System.out.println();
				System.out.println("		  |------");
				System.out.println("		  O     |");
				System.out.println("		  |     |");
				System.out.println("		  |     |");
				System.out.println("		        |");
				System.out.println("		   _____|");
			}

			if(HangmanCounter==3){
				System.out.println();
				System.out.println("		   |------");
				System.out.println("		   O     |");
				System.out.println("		  \\|     |");
				System.out.println("		   |     |");
				System.out.println("		         |");
				System.out.println("		    _____|");	
			}

			if(HangmanCounter==2){
				System.out.println();
				System.out.println("		   |------");
				System.out.println("		   O     |");
				System.out.println("		  \\|/    |");
				System.out.println("		   |     |");
				System.out.println("		         |");
				System.out.println("		    _____|");
			}

			if(HangmanCounter==1){
				System.out.println();
				System.out.println("		   |------");
				System.out.println("		   O     |");
				System.out.println("		  \\|/    |");
				System.out.println("		   |     |");
				System.out.println("		  /      |");
				System.out.println("		    _____|");
			}

			if(HangmanCounter==0){
				System.out.println();
				System.out.println("		   |------");
				System.out.println("		   O     |");
				System.out.println("		  \\|/    |");
				System.out.println("		   |     |");
				System.out.println("		  / \\    |");
				System.out.println("		    _____|");

				System.out.println("GAME OVER");
				System.out.println("The Correct word was "+ word);
				System.exit(0);
				}
			}
		}
}

