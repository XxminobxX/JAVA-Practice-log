import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        // Creating a simple program to print fibonacci series.
        System.out.println("Hello Welcome to the Fibonacci series program. \nEnter the number to print the series N number of times.");
        Scanner sc = new Scanner(System.in); 
         int user = sc.nextInt();

          long x = 0, y = 1, z;

        for (int i = 0; i <= user; i++) {
            z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }

    }

}
