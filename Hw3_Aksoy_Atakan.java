import java.util.Arrays;

import java.util.Scanner;

//Atakan Aksoy
//200201009
//Computer Engineering

public class Hw3_Aksoy_Atakan {
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean isPalindrome(String plnd) { //Part-1's method

        String palindres = "";  //defining variables
        String result = "";
        int c = 0;
        int i = 0;

        for (int j = 0; j < plnd.length(); j++) {   //loop for iterate
            if ((plnd.charAt(j) >= 'A' && plnd.charAt(j) <= 'Z') &&         //multiple condition for check the chars
                    (plnd.charAt(j) >= 'a' && plnd.charAt(j) <= 'z') &&
                    (plnd.charAt(j) >= '0' && plnd.charAt(j) <= '9')) {
                palindres += plnd.charAt(j);    //if char is alphanumeric, add it into an empty string
            }
        }

        for (int a = 0; a < palindres.length(); a++) {      //loop for iterate
            if (palindres.charAt(a) >= '0' && palindres.charAt(a) <= '9') {     //condition for check if all chars is numeric
                c++;
            }
        }
        if (c == palindres.length()) {  //if all chars numeric, make it the result
            result = plnd;

        }
        else {      //if it is not, make it all lowercase
            result = palindres.toLowerCase();
        }
        int cnt = result.length()-1;
        while (i <= cnt) {   //loop for check palindrome
            if (result.charAt(i) != result.charAt(cnt)) {       //condition for check palindrome
                return false;
            }
            i++;    //adding 1 to i
            cnt--;      //minus 1 to cnt

        }
        return true;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean isValidPassword(String pw){ //part 2's method

        int upcse = 0;  //defining variables
        int lowcse = 0;
        int dig = 0;
        int punct = 0;
        if (pw.length() < 10) { //condition for returning false
            return false;
        }
        for (int i = 0; i < pw.length(); i++) { //loop for checking
            if (pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z') { //condition for uppercase check
                upcse++;
            }
            if (pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z') { //condition for lowercase check
                lowcse++;
            }
            if (pw.charAt(i) >= '0' && pw.charAt(i) <= '9') { //condition for number check
                dig++;
            }
            if ((pw.charAt(i) == '!' || pw.charAt(i) == ',' || pw.charAt(i) == ';') ||
                    (pw.charAt(i) == '.' || pw.charAt(i) == '?' || pw.charAt(i) == '-') ||
                    (pw.charAt(i) == '\'' || pw.charAt(i) == '\"' || pw.charAt(i) == ':' || pw.charAt(i) == '@')) { //condition for symbol check
                punct++;
            }
        }
        if (upcse < 2) {  //conditions for returning falses
            return false;
        }
        if (lowcse < 1) {
            return false;
        }
        if (dig < 2) {
            return false;
        }
        if (punct < 1) {
            return false;
        }
        return true; //returning true if it is a valid pw.

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void arraySummary(int n) { //part 3's method
        int arr[] = new int[n];     //defining arrays
        int revArr[] = new int[n];
        int neg = 0;    //defining variables
        int zero = 0;
        int pos = 0;
        int even = 0;
        int odd = 0;
        Scanner arrInt = new Scanner(System.in);    //scanner code
        System.out.println("Please enter " + n + " integers:"); //asking for input
        for (int i = 0; i < n; i++) {   //loop for taking input
            int j = i+1;    //defining variable
            System.out.print("Integer " + j + ": ");    //asking for input
            int x = arrInt.nextInt();   //taking input
            arr[i] = x;     //adding to array
        }
        for (int j = 0; j < arr.length; j++){   //loop for reverse array
            revArr[j] = arr[arr.length -1 - j];     //creating reverse array
        }
        System.out.print("1. The array values are: ");
        for (int val: arr) {    //condition for iterate
            System.out.print(val + " ");
        }
        System.out.print("\n2. The reverse array is: ");
        for (int reVal: revArr) {   //condition for iterate
            System.out.print(reVal + " ");
        }
        Arrays.sort(arr);   //sorting the array for found min and max values
        System.out.println("\n3. The minimum value is: " + arr[0] + ", The maximum value is: " + arr[arr.length-1]);
        for (int num: arr) {    //loop for iterate
            if (num < 0){       //conditions for counting
                neg++;
            }
            if (num == 0) {
                zero++;
            }
            if (num > 0) {
                pos++;
            }
            if (num % 2 == 0) {
                even++;
            }
            if (num % 2 != 0) {
                odd++;
            }
        }
        System.out.print("4. There are " + pos + " positive numbers, " + neg + " negative numbers, ");
        System.out.println(even + " even numbers, " + odd + " odd numbers and " + zero + " zero values.");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void calculateVariance(int n) { //Part 4's method
        int myArr[] = new int[n];   //creating array
        double sum = 0; //defining variables
        double vrsum = 0;
        Scanner my = new Scanner(System.in);    //scanner code
        System.out.println("Please enter " + n + " integers:");
        for (int i = 0; i < n; i++) {   //loop for taking input
            int j = i+1;    //defining variable
            System.out.print("Integer " + j + ": ");    //asking for input
            int x = my.nextInt();   //taking input
            myArr[i] = x;     //adding to array
        }
        for (int elmnt: myArr) {    //loop for iterate
            sum += elmnt;   //summing elements of array
        }
        double avr = sum/n;     //calculating average
        for (int i = 0; i < n; i++) {   //loop for calculate
            double extr = myArr[i] - avr;   //calculating
            double sq = extr*extr;  //taking square
            vrsum += sq;    //adding results
        }
        double variance = vrsum/n;      //calculating variance
        System.out.println("The mean is: " + avr);      //printing the results
        System.out.println("The variance value is: " + variance);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////
        //Part 1:
        System.out.println("Part-1:");      //printing that we are in part 1
        Scanner inplnd = new Scanner(System.in);        //scanner command
        System.out.print("Please input a string: ");    //asking for input
        String plnd = inplnd.nextLine();    //taking input
        if (isPalindrome(plnd)) {       //condition for true
            System.out.println("True: The string \"" + plnd + "\" is a palindrome string."); //printing the result
        }
        else {  //condition for false
            System.out.println("False: The string \"" + plnd + "\" is not a palindrome string.");   //printing the result
        }
        /////////////////////////////////////////////////////////////////////////////
        //Part 2:
        System.out.println("Part-2:"); //printing that we are in part 2
        Scanner pass = new Scanner(System.in);  //scanner code
        System.out.print("Please enter a password: ");  //asking for input
        String pw = pass.nextLine();      //taking input
        if (isValidPassword(pw)) {  //condition for true pw
            System.out.println("True. Password is valid.");
        }
        else {  //condition for false pw
            System.out.println("False. \"" + pw + "\" is not a valid password.");
        }
        //////////////////////////////////////////////////////////////////////////////
        //Part-3:
        System.out.println("Part-3:");  //printing that we are in part 3
        Scanner arrSum = new Scanner(System.in);     //scanner code
        System.out.print("Please enter the size of the array (n): ");   //asking for input
        int n = arrSum.nextInt();   //taking input
        arraySummary(n);    //calling method
        ////////////////////////////////////////////////////////////////////////////////
        //Part-4:
        System.out.println("Part-4:");     //printing that we are in part 4
        Scanner calc = new Scanner(System.in);  //scanner code
        System.out.print("Please enter the size of the array (n): ");       //asking for input
        n = calc.nextInt();     //taking input
        calculateVariance(n);   //calling method
        /////////////////////////////////////////////////////////////////////////////

    }
}
