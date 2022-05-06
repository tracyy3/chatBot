import java.util.Scanner;

public class chatBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        greeting();
        repeatName();
        guessAge();
        countNumber();
        testUser();
        endConversation();
    }

//Greeting method
    static void greeting() {
        System.out.println("Hello! My name is ChatBoss.");
        System.out.println("I'm a chatbot from SpaceBot.");
        System.out.println("What did you say your name was again?");
    }

//User repeat name method
    static void repeatName() {
        String name = scanner.nextLine();
        System.out.println("I'm sorry, I didn't catch that, can you repeat your name again?");
        String repeatName= scanner.nextLine();
        System.out.println("I like your name, " + repeatName + "!");
    }

//Guess user age method
    static void guessAge() {
        System.out.println("Wow, you look great, let me guess your age.");
        System.out.println("Enter any number between 5, 18 and 30.");
        int rem5 = scanner.nextInt();
        int rem18 = scanner.nextInt();
        int rem30 = scanner.nextInt();
        int age = (rem5 * 70 + rem18 * 21 + rem30 * 16) % 106;
        System.out.println("Are you " + age + "? Wow, you look amazing for your age!");
    }

//Count to a number method
    static void countNumber() {
        System.out.println("Enter a number, I want to prove that I can count.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
        System.out.printf("%d!\n", i);
        }
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

    static void endConversation() { 
        System.out.println("Good job!");
    }
}

