// creating a program to create a simple star pattern

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       while (true) {
        
       System.out.println("\n");
        System.out.print("Enter the amount  of stars you want to print(box star pattern)(a*a form): ");
        int user = sc.nextInt();
       

       for(int i=0;i<=user;i++){
        System.out.println("");
        for(int j=0;j<=user;j++){
            System.out.print("*");
        }
       }
    }

    }
}