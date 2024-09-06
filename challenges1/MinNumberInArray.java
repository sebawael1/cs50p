public class MinNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6}; // Example array

        int minNumber = findMin(numbers);
        System.out.println("The minimum number in the array is: " + minNumber);
    }

    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = array[0]; // Start by assuming the first element is the minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if a smaller element is found
            }
        }
        return min;
    }
} 