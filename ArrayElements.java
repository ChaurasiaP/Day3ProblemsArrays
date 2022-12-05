import java.util.*;
class ArrayElements{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int lengthOfArray=sc.nextInt();

        int[] arrayElements=new int[lengthOfArray];

        for (int i=0; i<lengthOfArray; i++){
            arrayElements[i]=sc.nextInt();
        }
        System.out.println("Array is: "+ Arrays.toString(arrayElements));
        for (int i=0; i<lengthOfArray; i++){
            System.out.println(arrayElements[i]);
        }
    }
}