package assignments;
public class doubleArray {
    public static void main(String[] args) {
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] intArray = new int[doubleArray.length];
        
        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int) doubleArray[i];
        }
        
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}


    

