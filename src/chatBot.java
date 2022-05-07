import java.util.Scanner;
import java.util.Random;


public class chatBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        greeting();
        repeatName();
        guessAge();
        countNumber();
        testUser();
        end();
    }

//Greeting method
    static void greeting() {
        System.out.println("Hello! My name is ChatBoss.");
        System.out.println("I'm a chatbot from SpaceBot.");
        System.out.println("What's your name?");
    }

//User repeat name method
    static void repeatName() {
        String name = scanner.nextLine();
        System.out.println("I'm sorry, can you repeat your name again?");
        String repeatName= scanner.nextLine();
        System.out.println("Nice to meet you, " + repeatName + "!");
    }

//Guess user age method
    static void guessAge() {
            Random rnd = new Random();
            int age = rnd.nextInt(80);
            int limit = 5;
    
            Scanner scanner = new Scanner(System.in); 
            System.out.println("Can you guess my age? You will have 5 chances. Good luck!");
            for(int i = 0; i < limit; i++) {
            int answer = scanner.nextInt();
            if(answer == age) {
            System.out.println("You guessed it. Good job!");
            break; 
            }            
            else if(answer > age) {
            System.out.println("Younger than that, guess again."); 
            } 
            else {
            System.out.println("Older than that, guess again.");
            }
        }
            System.out.println("Good try! I am " + age + " years old.");
    }

//Count to a number method
    static void countNumber() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Let me count for you, Enter a number!");
        int num = scanner.nextInt();
        while(num + 1 > count){
        System.out.print(count++ + " ");
        }
        System.out.println();
    }

//Test user method
    static void testUser() {   
        System.out.println("Let's test your Java knowledge.");
        System.out.println("If a variable is declared as private, where may the variable be accessed?");
        System.out.println("1. A private variable may be accessed outside the class in which it is declared.\n" +
                           "2. A private variable may only be accessed within the class in which it is declared.\n" +
                           "3. A private variable may be changed outside the class in which it is declared.\n" +
                           "4. A private variable may be accessed by another class in which it wasn't declared.");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("");
            int num = Integer.parseInt(in.next());

            if (num == 2) {
                break; }
            else System.out.println("Please, try again.");
        }
    }

//Ending
    static void end() { 
        System.out.println("Good job!");
        }
    }

