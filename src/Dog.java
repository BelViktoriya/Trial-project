
import java.util.Scanner;

public class Dog {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of the dog... ");
		String s = scan.nextLine();
		System.out.print("Hello! My name is ");
		System.out.println(s);
		System.out.println("Let's take a journey with me!! Remember I know only English! I'll learn Russian language if you ask :)");
		System.out.println("Enter yes or no . I've woken up :) ");
		sleep : while (true) {//жизненный цикл, начинающийся после сна 
			System.out.println("Do I want to eat?");
			s = scan.nextLine();
			while (!"yes".equals(s) && !"no".equals(s)){ // 1 проверка 
				System.out.println("What is it? I don't understand you :'( Do I want to eat?");
				s = scan.nextLine();
			}
			while("yes".equals(s)){
				
				// цикл : я хочу есть?
				
				System.out.println("I'm in the kitchen. Is the bowl empty?");
				s=scan.nextLine();
				while (!"yes".equals(s) && !"no".equals(s)){ // 2 проверка 
					System.out.println("What is it? I don't understand you :'( Is the bowl empty?");
					s = scan.nextLine();
				}
				while ("yes".equals(s)){
					System.out.println("The bowl is empty.I am barking because I want to eat!! Is the bowl empty?");
					s=scan.nextLine();
					while (!"yes".equals(s) && !"no".equals(s)) 
					{//3 проверка 
						System.out.println("What is it? I don't understand you :'(");
						System.out.println("Is the bowl empty?");
						s = scan.nextLine();
					}
					if ("no".equals(s)) 
						break;
				};
				System.out.println("I am eating. Food has finished");
				System.out.println("Do I want to eat?");
				s = scan.nextLine();
				while (!"yes".equals(s) && !"no".equals(s)){ // 4 проверка 
					System.out.println("What is it? I don't understand you :'( Do I want to eat?");
					s = scan.nextLine();
				}
			}
			boolean activity=true;//
			act : while (activity){//{	
			System.out.println("What I want to do next(0-sleep,1-play with ball,2-gnaw bone,3-go for a walk)?");
			switch (scan.nextLine()) {
			default :
				System.out.println(":( I've asked to choose between 0,1,2,3!") ;
				continue act;
			case "0" :
				System.out.println("I am sleeping. ZZZZZZZZZZZZZZZZZZZZZZZZ. I've woken up") ; 
				continue sleep;
			case "1":
				System.out.println("I am playing. La la la. I've played");
				continue sleep;
			case "2":
				System.out.println("I am gnawing the bone. Am am am. I've gnowed the bone");
				continue sleep;
			case "3":
				boolean walk=true;
				walking : while (walk){
				System.out.println("I will go walking. Choose 0 for walking near the house or 1 for walking in the playground for dogs");
				switch (scan.nextLine()){
				case "0":
					System.out.println("I am walking, barking at people, running for cars. Am I tired?");
					walk=false;
					break;
				case "1":
					System.out.println("I am playing with other dogs, doing exersises and so on. Am I tired?");
					walk=false;
					break;
				default :
					System.out.println(":( I've asked to choose between 0,1!") ; 
					continue walking;
				}
				}

				s=scan.nextLine();
				boolean tired=false;
				tired : while (!tired) {
					if ("yes".equals(s)) {//устал? да
						System.out.println("I am going home");
						continue sleep;
					}
					else{
						if ("no".equals(s)){ //не устал
							System.out.println("Does the owner want to go home?");
							s=scan.nextLine();
							if ("yes".equals(s)){//хозяин тащит домой 
								System.out.println("I am walking home"); 
								continue sleep;
							}
							else
								if ("no".equals(s)){//не тащит
									System.out.println("I am still walking. Am I tired?");

									s=scan.nextLine();
									if ("yes".equals(s))
									{ 
										tired=true;System.out.println("I am going home");
										continue sleep;
									}
									else
										if ("no".equals(s))
											tired=false;
										else{ 
											System.out.println("What is it? I don't understand you");
											System.out.println("Am I tired");
											s=scan.nextLine();
											continue tired;
										}
								}
								else {
									System.out.println("What is it? I don't understand you!!!!");
									System.out.println("Does the owner want to go home?..");
									s=scan.nextLine();
									continue tired;
								}
						}
						else{// если введена ерунда
							System.out.println("What is it? I don't understand you :'( ");
							System.out.println("Am I tired?");
							s=scan.nextLine();
							continue tired;
						}
					}

				}
				
			}

		}//
			break;
		}
	}

}

