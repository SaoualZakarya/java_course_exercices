import java.util.Arrays;
import java.util.Random;

public class exo1 {

    public static void traverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void copyArray(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Copied Array: " + Arrays.toString(newArray));
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void searchArray(int[] array, int value) {
        // Return the index of the found value
        int index = Arrays.binarySearch(array, value);
        if (index >= 0) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }     
        array[5] = 5 ;
        traverseArray(array);
    
        copyArray(array);
      
        sortArray(array);
      
        searchArray(array, 5);
        
    }

}

