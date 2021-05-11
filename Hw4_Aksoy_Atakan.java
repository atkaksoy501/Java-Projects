//Atakan Aksoy
//200201009
//Computer Engineering

import java.util.*;

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

    public static ArrayList<String> repeatElements(ArrayList<String> list, int k) { //Part 3's method
        final String first = list.get(0);   //defining variable
        if (k <= 0) {  //condition for check if k is equal or less than 0
            list.clear();   //clearing the list
            return list;    //returning the cleared list
        }
        while (true) {  //infinite loop

            for (int j = 0; j < k; j++) {   //loop for count
                list.add(list.get(0));  //adding first item to the list
            }
            list.remove(0); //removing first item
            if (first.equals(list.get(0))) {    //condition for break the loop
                break;  //breaking the loop
            }
        }
        return list;    //returning the result
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
        System.out.println("Part-3:");  //printing that we are in part 3
        Scanner str = new Scanner(System.in);   //scanner code
        ArrayList<String> list = new ArrayList<String>();   //creating an arraylist
        System.out.print("Enter number of strings: ");  //asking for input
        int nm = str.nextInt();     //taking input
        System.out.println("Enter " + nm + " strings:");    //asking for input
        Scanner take = new Scanner(System.in);  //scanner code
        for (int i = 0; i < nm; i++) {  //loop for count
            String string = take.nextLine();    //taking input
            list.add(string);   //adding inputs to list
        }
        System.out.print("Enter the value of k (stretch value): "); //asking for input
        int k = take.nextInt(); //taking input
        System.out.println("The original arraylist is: " + list);  //printing the results
        System.out.println("The repeated arraylist is: " + repeatElements(list, k));

        ////////////////////////////////////////////////////////////////////////
        //Part-4
        System.out.println("Part-4:");  //printing that we are in part 4
        Scanner takeArr = new Scanner(System.in);   //scanner code
        System.out.print("Enter the size of array (n): ");  //asking for input
        int n = takeArr.nextInt();  //taking input
        int[] myArray = new int[n]; //creating an array
        System.out.println("Enter " + n + " integers:");    //asking for input
        for (int i = 0; i < n; i++) {   //loop for take inputs
            int takeInt = takeArr.nextInt();    //taking input
            myArray[i] = takeInt;   //adding inputs to array
        }
        System.out.println("1- The values of myArray are: " + Arrays.toString(myArray));    //printing result
        double sum = 0; //defining variable
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();  //creating an arraylist
        for (int nums: myArray) {   //loop for iterate
            sum += nums;    //adding items to sum
            if (!myArrayList.contains(nums)) {  //condition for not to take duplications into arraylist
                myArrayList.add(nums);  //adding items without duplications to arraylist
            }
        }
        int sumInt = (int) sum; //converting double to int
        System.out.println("2- The sum is: " + sumInt + ". The mean is: " + sum/n); //printing result
        System.out.println("3- The values of myArrayList are: " + myArrayList); //printing result
        sumInt = 0; //defining variables
        sum = 0;
        for (int numlist: myArrayList) {    //loop for iterate
            sumInt += numlist;  //adding items to sum
            sum += numlist;
        }
        double mean = sum/myArrayList.size();   //calculating mean
        System.out.println("4- The sum is: " + sumInt + ". The mean is: " + mean);   //printing result
        /////////////////////////////////////////////////////////////////////////////////


    }


}
