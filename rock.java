// Creating a Rock,Paper and Scissor game with the help of ASCII art.
import java.util.Random;
import java.util.Scanner;

public class  rock {
    public static void main(String[] args) {
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
 int user = sc.nextInt();


// To generate Radom computer choice.
  Random random = new Random();
  int comp = random.nextInt(3);
  //Generating user and comp ASCII art and result.

  // Comp ASCII!

   switch (comp) {
    case (0):
        System.out.println(rock);
        break;
    case(1):
        System.out.println(paper);
    case(2):
        System.out.println(scissors);
   
    default:
        break;
   }

   // User ASCII 
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
  




    }
}