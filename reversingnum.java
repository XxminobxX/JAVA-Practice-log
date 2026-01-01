// Wrtie a program to  reverse a number given by the user.

import java.util.Scanner;

public class reversingnum {
    public static void main(String[] args) {

        System.out.print("Enter the number you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int ans = 0 ,rem;

        while (user>0) {
            rem = user % 10;
            user /= 10;
            ans *= 10;
            ans += rem;

            
        }

      System.out.println(ans);
        

    }
}
