import java.util.*;
class ReverseArray {
    public static void main(String[] args) {

        // GETTING THE ARRAY LENGTH
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int arrLen = sc.nextInt();

        // INITIALIZING AN EMPTY ARRAY TO STORE REVERSED VALUES
        int[] reverseArray = new int[arrLen];

        // INITIALIZING AN EMPTY ARRAY TO GET THE USER INPUT
        int[] arrayElements = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            arrayElements[i] = sc.nextInt();
        }

        // PRINTING THE USER ARRAY
        System.out.println("The Array is: " + Arrays.toString(arrayElements));

        // REVERSING THE USER ARRAY
        for (int i = 0; i < arrLen; i++) {
            reverseArray[i] = arrayElements[arrLen - i - 1];
        }

        //PRINTING THE REVERSED ARRAY
            System.out.println("Reversed Array" +Arrays.toString(reverseArray));
    }
}