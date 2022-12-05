import java.util.*;
class EvenElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int lengthOfArray = sc.nextInt();

        int[] arrayElements = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            arrayElements[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arrayElements));
        for (int i = 0; i < lengthOfArray; i++) {
            if (i%2==0) {
                System.out.println("The "+i+" element is "+ arrayElements[i]);
            }
        }
    }
}
/* ARRAY INDICES STARTS FROM O SO FIRST ELEMENT IN THE ARRAY WILL BE TAKEN AS ZEROTH ELEMENT AND
AND THE SECOND ELEMENT AS THE FIRST AND SO ON.*/