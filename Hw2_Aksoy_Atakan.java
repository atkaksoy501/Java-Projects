
import java.util.Random;    //importing methods
import java.util.Scanner;
import java.text.DecimalFormat;


public class Hw2_Aksoy_Atakan {
    public static int countSubStr(String a, String b) { //Part-1's first method
        int i = 0;  //defining variables
        int cnt = 0;
        while (i <= a.length()) {      //loop for count
            boolean comp = a.regionMatches(i, b, 0, b.length());    //defining variable
            if (comp == true) {     //condition for counting
                cnt++;  //adding 1 to count
                i++;
            }
            else {
                i++;    //adding 1 to count
            }
        }

        return cnt;     //returning the result
    }
    public static String removeSubStr(String a, String b) { //Part-1's second method
        int i = 0;      //defining variable
        while (i <= a.length()) {       //loop for counting
            boolean comp = a.regionMatches(i, b, 0, b.length());    //defining variable
            if (comp == true) {     //condition for counting
                a = a.replace(a.substring(i, i+b.length()), "");        //replacing chars with space
                i++;    //adding 1 to count
            }
            else {
                i++;    //adding 1 to count
            }
        }
        return a;       //returning the result

    }

    public static boolean checkChars(String splt, String second) { //Part-2's method

        for (int i = 0; i < second.length(); i++) {     //loop for count
            char chs = second.charAt(i);        //defining variable
            boolean result = splt.contains(String.valueOf(chs));        //defining variable
            if (!result) {      //condition for returning false
                return false;   //returning false
            }
        }
        return true;        //returning true
    }

    public static String makeBox(int boxn, char ch) { //Part-4's method
        String box = "";        //defining an empty string
        for (int i = 0; i < boxn; i++) {    //loop for counting
            box += ch;      //adding chars into string
        }

        for (int b = 0; b < boxn-2; b++) {      //loop for counting
            box += "\n" + ch;       //adding a char to string and entering new line
            for (int x = 0; x < boxn-2; x++) {      //loop for counting
                box += " ";     //adding spaces into string
            }
            box += ch;  //adding char into string
        }
        box += "\n";    //entering to new line

        for (int s = 0; s < boxn; s++) {        //loop for counting
            box += ch;      //adding chars into string
        }

        return box;     //returning the string


    }

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////////////////////
        //Part-1
        System.out.println("Part-1:"); //printing that we are in part1
        Scanner scan = new Scanner(System.in);      //scan code
        System.out.print("Please enter a string: ");    //asking for input
        String a = scan.nextLine();     //taking input
        System.out.print("Please enter second string: ");       //asking for input
        String b = scan.nextLine();     //taking input

        System.out.println("\"" + b + "\"" +  " occurs " + countSubStr(a, b) + " times in " + "\"" + a + "\""); //printing the result
        System.out.println("Removed substring: " + removeSubStr(a, b));     //printing the result
        /////////////////////////////////////////////////////////////////////////////////////
        //Part-2
        System.out.println("Part-2:"); //printing that we are in part2
        Scanner inp = new Scanner(System.in);   //scanner code
        System.out.print("Enter the first string: ");       //asking for input
        String first = inp.nextLine();      //taking input
        System.out.print("Enter the second string: ");      //asking for input
        String second = inp.nextLine();     //taking input
        String[] splitted = first.split(" ");       //splitting the words

        for (int x = 0; x <= splitted.length-1; x++) {  //loop for counting
            String splt = splitted[x];      //indexing the chars in words

            if (checkChars(splt, second) == true) {     //condition for check
                System.out.println(splt);       //printing the words
            }
        }


        //////////////////////////////////////////////////////////////////////////////////////
        //Part-3
        System.out.println("part-3:"); //printing that we are in part3
        Scanner num = new Scanner(System.in); //scanner code
        System.out.print("Please enter n value: "); //asking for input
        int n = num.nextInt();      //taking input
        System.out.print("Please enter k value: "); //asking for input
        int k = num.nextInt();      //taking input
        double sum = 0;     //defining variables
        double sqsum = 0;
        double roundedav = 0;
        double sq = 0;
        String rndsum = "";
        String fmt = "0.";

        for (int j = 0; j < k; j++) {   //loop for counting
            fmt = fmt + "#";        //adding chars for formatting
        }
        DecimalFormat fmt2 = new DecimalFormat(fmt);    //formatting code
        double start = 0;       //defining the interval
        double end = 100;
        System.out.println("5 random double numbers and rounded numbers are:");     //printing
        for (int rd = 0; rd <= n; rd++) {       //loop for counting
            double random = new Random().nextDouble();      //codes for creating random numbers
            double resultran = start + (random * (end - start));
            double rounded_num = Double.valueOf(fmt2.format(resultran)); //formatting numbers
            roundedav += rounded_num;   //summing rounded numbers
            sum += resultran;   //summing numbers
            sq = Math.sqrt(resultran);  //calculating squareroots of numbers
            sqsum += sq;        //summing squareroots
            rndsum += fmt2.format(resultran);   //formatting result
            System.out.println(resultran + "    " + fmt2.format(resultran));        //printing result
        }
        double rounded_avr = Double.valueOf(fmt2.format(roundedav));    //rounding the result
        System.out.println("Sum of these numbers: " + sum);     //printing the results
        System.out.println("Average of these numbers: " + sum/n);
        System.out.println("Average of their square roots: " + sqsum/n);
        System.out.println("Average of these numbers by rounding them to " + k + " decimals: " + rounded_avr/n);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Part-4
        System.out.println("Part-4:");  //printing that we are in part4
        Scanner box = new Scanner(System.in);       //scanner code
        System.out.print("Enter border character: ");       //asking for input
        char ch = box.next().charAt(0);     //taking input
        System.out.print("Enter side length: ");        //asking for input
        int boxn = box.nextInt();   //taking input
        System.out.println(makeBox(boxn, ch));      //printing the result
        /////////////////////////////////////////////////////////////////////////////////////////////

        


    }
}
