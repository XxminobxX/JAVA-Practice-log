import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Program Ended.");
                break;
            }

            System.out.print("Enter num 1: ");
            int num1 = sc.nextInt();

            System.out.print("Enter num 2: ");
            int num2 = sc.nextInt();

            int ans = 0;

            if (op == '+') {
                ans = num1 + num2;
            } 
            else if (op == '-') {
                ans = num1 - num2;
            } 
            else if (op == '*') {
                ans = num1 * num2;
            } 
            else if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    continue;
                }
            } 
            else if (op == '%') {
                ans = num1 % num2;
            } 
            else {
                System.out.println("Invalid operation!");
                continue;
            }

            System.out.println("Your answer is: " + ans);
        }

        sc.close();
    }
}
