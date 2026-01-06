// Creating a Rock,Paper and Scissor game with the help of ASCII art.
import java.util.Random;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {

        while (true) {
            Scanner sc  = new Scanner(System.in);

            // Defining ASCII variables 
            String rock = """
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
""";

            String paper = """
     _______
---'    ____)____
           ______)
          _______)
         _______)
---.__________)
""";

            String scissors = """
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
""";
            //Welcome message and how to play.
            System.out.println("Welcome to Rock,Paper,Scissors game.");
            System.out.println("It's YOU VS COMPUTER.");
            System.out.println(" Rock --> 0 \n Paper --> 1 \n Scissor --> 2 \n EXIT --> 9");
            System.out.print("Enter your choice: ");

            // Entering about user choice.
            int user;
             try { 
                user = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.\n\n");
                continue; 
            }

            // To generate Radom computer choice.
            Random random = new Random();
            int comp = random.nextInt(3);

            if(user == 9 ){
                System.out.println("Exited....");
                 break;
            }

            //Generating user and comp ASCII art and result.

            // Comp ASCII!
            System.out.println("Computer choice:");
            switch (comp) {
                case (0):
                    System.out.println(rock);
                    break;
                case(1):
                    System.out.println(paper);
                    break;
                case(2):
                    System.out.println(scissors);
                default:
                    break;
            }

            // User ASCII 
            System.out.println("Your choice:");
            switch (user) {
                case (0):
                    System.out.println(rock);
                    break;
                case(1):
                    System.out.println(paper);
                    break;
                case(2):
                    System.out.println(scissors);
                    break;
                case (9): 
                    System.out.println("Exit");
                    break;
                default: 
                    System.out.println("You performed an invalid opearation.");
                    break;
            }

            // Main game logic.
            if (user == 0 && comp == 0) {
                System.out.println("AHH! It's a tie , Try again. ");
            } else if (user == 0 && comp == 1){
                System.out.println("Computer won! Better luck next time ;)");
            } else if (user == 0 && comp == 2){
                System.out.println("Bravo! You won.");
            } else if (user == 1 && comp == 0){
                System.out.println("Bravo! You won.");
            } else if (user == 1 && comp == 1){
                System.out.println("AHH! It's a tie , Try again.");
            } else if (user == 1 && comp == 2){
                System.out.println("Computer won! Better luck next time ;)");
            } else if (user == 2 && comp == 0){
                System.out.println("Computer won! Better luck next time ;)");
            } else if (user == 2 && comp == 1){
                System.out.println("Bravo! You won.");
            } else if (user == 2 && comp == 2){
                System.out.println("AHH! It's a tie , Try again.");
            }
        }
    }
}
