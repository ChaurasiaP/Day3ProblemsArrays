import java.util.*;
class FrequencyOfElements {
    public static void main(String[] args) {

        // getting the array length
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int arrLength = sc.nextInt();

        // creating array
        int[] arrElements = new int[arrLength];

        //creating an array to store the frequency of elements
        int[] frequency=new int[arrLength];

        int c = -1;

        //method to get array elements
        for (int k = 0; k < arrLength; k++) {
            arrElements[k] = sc.nextInt();
        }

        for (int i = 0; i < arrLength; i++) {
            int counter = 1;
            for (int j = i + 1; j < arrLength; j++) {
                if (arrElements[i] == arrElements[j]) {
                    counter++;
                    frequency[j] = c;
                }
            }
            if (frequency[i] != c) {
                frequency[i] = counter;
            }
        }
        for(int i=0; i< frequency.length;i++){
            if (frequency[i]!=c){
                System.out.println(arrElements[i]+" appeared "+frequency[i]+" times");
            }
        }
    }
}
