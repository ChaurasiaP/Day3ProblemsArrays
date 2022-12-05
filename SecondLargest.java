import java.util.*;
class SecondLargest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int arrLen=sc.nextInt();

        int[] sortedArray=new int[arrLen];

        int[] arrayElements=new int[arrLen];
        for (int i=0; i<arrLen; i++){
            arrayElements[i]= sc.nextInt();
        }
        System.out.println("The Array is: " +Arrays.toString(arrayElements));

        for (int i=0; i<arrLen; i++){
            for (int j=0; j<arrLen-1-i; j++){
                if (arrayElements[j] > arrayElements[j+1]){
                    int temp=arrayElements[j];
                    arrayElements[j] = arrayElements[j+1];
                    arrayElements[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arrLen; i++){
            sortedArray[i]=arrayElements[i];
        }
        System.out.println("Second Largest Element in Array: "+ sortedArray[arrLen-2]);
    }
}

