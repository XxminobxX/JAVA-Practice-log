//Creating a program that check the occurrence of a particular number from a user.

import java.util.Scanner;

public class occurrence_count{
    public static void main(String[] args) {

        System.out.print("Enter a long number:");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();  

        System.out.print("Enter the number whose occurrence you want to check:");
        Scanner sc1 = new Scanner(System.in);
        int check = sc1.nextInt();

        int occur = 0;

        while (num > 0){
              int rem = num % 10;
            
               if (rem==check){
                occur++;
             }
            
             num/=10;
            
             
         }

      System.out.println("The number have appeared this many times:" +occur);
        
    }
 
}
