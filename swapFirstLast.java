package assignments;

public class swapFirstLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Swap the first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1]; 
        arr[arr.length - 1] = temp;
        
        // Print the modified array
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

