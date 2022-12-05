import java.util.*;
class DuplicateElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int arrLen=sc.nextInt();

        int[] arrayElements=new int[arrLen];

        for (int i=0; i<arrLen; i++){
            arrayElements[i]=sc.nextInt();
        }

        System.out.println("DUPLICATE ELEMENTS IN THE GIVEN ARRAY ARE: ");

        // CHECKING AND PRINTING THE DUPLICATE VALUES SIMULTANEOUSLY
        for (int i=0; i<arrLen; i++){
            for (int j=i+1; j<arrLen; j++){
                if (arrayElements[i] == arrayElements[j]){
                    System.out.println(arrayElements[i]);
                }
            }
        }
    }
}
