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
        System.out.println("The array is: "+Arrays.toString(arrayElements));
        System.out.print("Elements at even Position: ");
        for(int i=1; i<lengthOfArray; i=i+2){
            System.out.print(arrayElements[i]+" ");
        }
    }
}
