//Atakan Aksoy
//200201009
//Computer Engineering



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hw4_Aksoy_Atakan {

    public static int[] sortArray(int[] arr){ //Part 1's method 1

        int i = 0; //defining variables
        int n = 0;

        while (true) {  //infinite loop

            if (arr[i] > arr[i+1]) {    //condition for sorting
                int val = arr[i];  //defining variable
                arr[i] = arr[i+1];  //changing elements in array
                arr[i+1] = val; //changing elements in array
                i = 0;  //returning to back
            }

            i++;    //adding 1 to count
            while (i+1 == 10) {     //loop for last check

                if (arr[n] > arr[n+1]) {    //condition for sorting
                    int fir = arr[n];   //defining variable
                    arr[n] = arr[n+1];  //changing elements in array
                    arr[n+1] = fir;
                    n = 0;  //returning back
                }
                n++;    //adding 1 to count

                if (n+1 == 10) {    //condition for check
                    break;  //if last check is done, break
                }

            }
            if (n+1 == 10) {    //condiditon for check
                break;  //if all checks are done, break infinite loop
            }
        }
        return arr;     //return the result

    }

    public static void printArray(int[] prnt) { //Part 1's second method

        for (int i: prnt) { //loop for iterate
            System.out.print(i + " ");  //printing elements
        }
        System.out.println(""); //entering to new line after print all elements
    }

    public static void arrayListSummary(ArrayList<String> arrList) {  //Part 2's method
        System.out.println("1- The original array list is: " + arrList);    //printing result 1
        ArrayList<String> sorted;   //creating an arraylist
        ArrayList<String> reversed = new ArrayList<>();     //creating an arraylist
        sorted = (ArrayList<String>) arrList.clone();   //cloning the arraylist
        Collections.sort(sorted);       //sorting the arraylist
        System.out.println("2- The sorted version of the array list is: " + sorted);    //printing result 2
        System.out.println("3- The sizes of the elements of the array list are:");  //printing result 3
        for (String a: arrList) {   //loop for iterate
            System.out.println(a + "    " + a.length() + " characters");    //printing results
        }
        for (int i = arrList.size()-1; i >= 0; i--) {   //loop for reverse count
            reversed.add(arrList.get(i));   //adding items from end to beginning
        }
        System.out.println("4- The reversed version of the array list is: " + reversed);    //printing result 4
    }



    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////
        //Part-1
        System.out.println("Part-1:");  //Printing that we are in part 1
        Scanner scan = new Scanner(System.in);  //scanner code
        int arr[] = new int[10];    //defining the array with length 10
        for (int i = 1; i <= 10; i++) { //loop for count
            System.out.print("Enter number " + i + ": ");   //asking for input
            int inp = scan.nextInt();   //taking input
            arr[i-1] = inp;     //adding input to the array
        }

        System.out.print("Your original array is: ");   //printing results
        printArray(arr);
        System.out.print("Sorted array: ");
        printArray(sortArray(arr));
        //////////////////////////////////////////////////////////////////////////
        //Part-2
        System.out.println("Part-2:"); //printing that we are in part 2
        Scanner lst = new Scanner(System.in);   //scanner code
        ArrayList<String> arrList = new ArrayList<String>();    //creating an arraylist
        System.out.print("Enter number of strings: ");  //asking for input
        int num = scan.nextInt();   //taking input
        System.out.println("Enter " + num + " strings:"); //asking for input
        for (int i = 0; i < num; i++) {     //loop for count
            String word = lst.nextLine();   //taking input
            arrList.add(word);  //adding inputs to list
        }
        arrayListSummary(arrList);  //calling method
        /////////////////////////////////////////////////////////////////////////
        //Part-3







    }


}
