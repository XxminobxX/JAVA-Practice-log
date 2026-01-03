// Write a program to print a personalised greeting message

import java.util.Scanner;

public class practice {
 
  
      public static void greeting(String name){
    System.out.println("Hello " +name);
    }
    public static void main(String[] args) {
        System.out.print("What's your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next().trim();
       
        greeting(name);

    }
     
}
