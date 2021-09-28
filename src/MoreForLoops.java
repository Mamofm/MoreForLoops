/*
1. Write a for loop that prints all the odd numbers from 1-20.
2. Write a for loop that prints all the even numbers from 1-20.
3. Write a for loop to reverse a string provided by the user.
   For example,  reverse of "Program" is "margorP"
4. Write a for loop that display all the factors of a number provided by the user.
   For example, the factors of 10 is 1, 2, 5.
5. Write a for loop that computes the factorial of a number provided by the user.
  For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).
*/

import java.util.Scanner;
public class MoreForLoops {
    public static void main(String args[]) {
        // 1. Write a program that prints all the odd numbers from 1-20. Section
        int num = 20;
        String phrase;

        Scanner keybd = new Scanner(System.in);

        // use for loop
        //1. Write a program that prints all the odd numbers from 1-20. Section
        System.out.println ("Odd numbers from 1-20. Section");
        for (int i = 1; i <= num; i++) {
            if ((i%2) > 0)
              System.out.print(i + "  ");
        }
        System.out.println("\n");

        //2. Write a for loop that prints all the even numbers from 1-20.
        System.out.println ("Even numbers from 1-20. Section");
        for (int i = 1; i <= num; i++) {
            if ((i%2) == 0)
                System.out.print(i + "  ");
        }
        System.out.println("\n");

        //3. Write a for loop to reverse a string provided by the user.
        //    For example,  reverse of "Program" is "margorP"
        System.out.print ("Enter a string to display its Reverse: ");
        phrase = keybd.nextLine();

        for (int i = phrase.length()-1; i >= 0; i--) {
                System.out.print(phrase.charAt(i));
        }
        System.out.println("\n");

        //4. Write a for loop that display all the factors of a number provided by the user.
        //        For example, the factors of 10 is 1, 2, 5.
        System.out.print("Enter a number to calculate a Factor of that number: ");
        num = keybd.nextInt();

        for (int i = 1; i < num; i++) {
            if ((num%i) == 0)
             System.out.print(i + "  ");
        }
        System.out.println("\n");

        // 5. Write a for loop that computes the factorial of a number provided by the user.
        // For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).
        System.out.print ("Factorial of a number: ");
        num = keybd.nextInt();
        int factorial=1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
