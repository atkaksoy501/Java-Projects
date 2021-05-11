import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*  Atakan Aksoy
    200201009
    Computer Engineering
 */


public class Hw1_Aksoy_Atakan {

    public static void main(String[] args) {

        //Part-1
        System.out.println("Part-1:");  //Printing that we are in part 1.

        Scanner scan = new Scanner(System.in);  //Scanner command for take input.

        System.out.print("Please enter your name: ");   //Asking for name.
        String name = scan.nextLine();  //Taking name.

        System.out.print("Please enter item's name: "); //Asking for item name.
        String item = scan.nextLine();  //Taking item name.

        System.out.print("Please enter amount of the item to be bought: ");     //Asking for amount.
        int number = scan.nextInt();    //Taking amount.

        System.out.print("Please enter item's unit price: ");   //Asking for unit price.
        double price = scan.nextDouble();   //Taking unit price.

        double result = price * number;     //Calculating the result.

        System.out.println("Hello " + name + "!");  //Printing name.
        System.out.println("The total cost of " + item + " is " + result);  //Printing the result.

        ////////////////////////////////////////////////////////////////////////////////////////

        //Part-2
        System.out.println("\nPart-2:");  //Printing that we are in Part 2.

        Scanner taxin = new Scanner(System.in);     //Command for taking input.

        System.out.print("Please enter your income: ");     //Asking for income.
        int income = taxin.nextInt();       //Taking income.
        if (income <= 10000) {      //Creating a condition for tax.
            double tax = income * 15 / 100;  //Calculating tax.
            System.out.println("Your tax: " + tax);     //Printing the result.
        }
        if (income > 10000 && income <= 25000) { //Creating a condition for tax.
            double taxcon = income - 10000;  //Calculating the remaining part.
            double taxper = taxcon / 5;     //Calculating remaining part's tax.
            double tax = taxper + 1500;     //Calculating the result.
            System.out.println("Your tax: " + tax);  //Printing the result.
        }
        if (income > 25000 && income <= 58000) {  //Creating a condition for tax.
            double taxcon = income - 25000;  //Calculating the remaining part.
            double taxper = taxcon * 27 / 100;      //Calculating remaining part's tax.
            double tax = taxper + 4500;     //Calculating the result.
            System.out.println("Your tax: " + tax);  //Printing the result.
        }
        if (income > 58000) {  //Creating a condition for tax.
            double taxcon = income - 58000;  //Calculating the remaining part.
            double taxper = taxcon * 35 / 100;      //Calculating remaining part's tax.
            double tax = taxper + 13410;        //Calculating the result.
            System.out.println("Your tax: " + tax);  //Printing the result.
        }
        System.out.println("\"Death, taxes and childbirth! There's never any convenient time for any of them.\" \n- Margaret Mitchell, Gone with the Wind"); //Printing the saying.

        /////////////////////////////////////////////////////////////////////////////////////

        //Part-3

        System.out.println("\nPart-3:"); //Printing that we are in Part 3.
        int fizzcnt = 0;        //Defining the variables.
        int buzzcnt = 0;
        int fizzbuzzcnt = 0;
        for (int num = 1; num <= 100; num++) {  //Creating for loop for counting the numbers.
            if (num % 3 == 0 && num % 5 != 0) {     //Creating a condition for multiples of three.
                System.out.println("Fizz");     //Printing Fizz.
                fizzcnt += 1;       //Counting Fizzes.
            }
            if (num % 5 == 0 && num % 3 != 0) {     //Creating a condition for multiples of five.
                System.out.println("Buzz");     //Printing Buzz.
                buzzcnt += 1;       //Counting Buzzes.
            }
            if (num % 5 == 0 && num % 3 == 0) {     //Creating a condition for multiples of both three and five.
                System.out.println("FizzBuzz");     //Printing FizzBuzz.
                fizzbuzzcnt += 1;       //Counting FizzBuzzes.
            }
            if (num % 3 != 0 && num % 5 != 0) {     //Creating a condition for not Buzz or Fizz or BuzzFizz numbers.
                System.out.println(num);        //Printing number.
            }

        }
        System.out.println("Fizz count: " + fizzcnt);       //Printing the counting results of Buzz, Fizz and BuzzFizz.
        System.out.println("Buzz count: " + buzzcnt);
        System.out.println("FizzBuzz count: " + fizzbuzzcnt);

        /////////////////////////////////////////////////////////////////////////////////////////////

        //Part-4

        System.out.println("\nPart-4:"); //Printing that we are in Part 4.

        Scanner inp = new Scanner(System.in);   //Scanner function to take input.
        while (true) {     //While loop for asking an input while user enters a negative number.

            System.out.print("Enter a number: ");       //Asking for input.
            int factinp = inp.nextInt();        //Taking input.
            int factres = 1;        //Defining a variable
            if (factinp < 0) {      //Condition for negative input.
                System.out.println("Please enter a positive number or zero.");      //Warning message.
            }

            if (factinp == 0 || factinp == 1) {     //Condition for zero and one.
                System.out.println("Factorial of " + factinp + " is " + "1");   //Printing the result.
                break;      //Breaking the while loop.
            }
            else if (factinp >= 0) {      //Condition for calculate the result.
                for (int fac = 1; fac <= factinp; fac++) {      //For loop for calculate.
                    factres *= fac;     //Calculating the result.
                }
                System.out.println("Factorial of " + factinp + " is " + factres);   //Printing the result.
                break;      //Breaking the while loop.
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////

        //Part-5

        System.out.println("\nPart-5");     //Printing that we are in part 5.
        double sum = 0;     //Defining variable.
        ArrayList<Integer> inplist = new ArrayList<>();     //Creating an arraylist.
        while (true) {      //While loop.
            Scanner seqin = new Scanner(System.in);     //Scanner command.
            System.out.print("Enter a number (to stop enter -1) : ");   //Asking for input.
            int avinp = seqin.nextInt();        //Taking input.

            if (avinp != -1) {      //Condition for saving inputs.
                inplist.add(avinp);     //Adding inputs into list.
            }

            if (avinp == -1) {      //Condition for stop.
                for (int i: inplist) {      //For loop for calculating sum of the inputs.
                    sum += i;       //Calculating sum.
                }
                break;      //Breaking the while loop.
            }
        }
        double sumres = sum / inplist.size();       //Calculating the average.
        System.out.println("The average: " + sumres);       //Printing the average.
        System.out.println("The maximum number is " + Collections.max(inplist) + ".");      //Finding the max number and print it.

        //////////////////////////////////////////////////////////////////////////////////////////



    }
}
