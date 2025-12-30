
import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {

    // Creating a simple code to check whether the first letter of given word is uppercase or lowercase.

        System.out.print("Enter your word:");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
       
        if(ch >='a'&& ch <= 'z' ) {
            System.out.println("The first letter is lower  case.");
        }
        else{
            System.out.println("The first letter is Upper case.");
        }

    }

}
