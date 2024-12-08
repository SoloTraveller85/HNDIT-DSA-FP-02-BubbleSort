package aftha;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {9, 1, 8, 4};
        
        int n = numbers.length;
        boolean swapped;

       
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                
                if (numbers[j] > numbers[j + 1]) {
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    swapped = true; 
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}