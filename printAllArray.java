package assignments;

public class printAllArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        // Initialize the array with values from 1 to 10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        // Print all the elements of the array
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
