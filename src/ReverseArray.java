public class ReverseArray {

    public static void reverseArray(int[] inputArray) {

        int[] outputArray = new int[inputArray.length];

        System.out.print("O vetor invertido é [");

        for (int i = inputArray.length - 1; i >= 0; i--) {
            outputArray[outputArray.length - 1 - i] = inputArray[i];
            System.out.print(outputArray[outputArray.length - 1 - i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.print("]");
    }

    public static void main(String args[]) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7};

        reverseArray(myArray);
    }
}