import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Import individual sorting algorithm classes
import com.example.sort.BubbleSort;
import com.example.sort.InsertionSort;
import com.example.sort.HeapSort;
import com.example.sort.MergeSort;
import com.example.sort.QuickSort;
import com.example.sort.SelectionSort;
import com.example.sort.ShellSort;
import com.example.sort.SortingAlgorithmInterface;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = generateRandomArray(size);

        /* COMMENT OR UNCOMMENT to view or not view original array */
        // System.out.println("Original Array: " + Arrays.toString(array));

        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Heap Sort");
        System.out.println("7. Shell Sort");

        int choice = scanner.nextInt();
        SortingAlgorithmInterface sortingAlgorithm = getSortingAlgorithm(choice);
        sortingAlgorithm.sort(array);

        // Calculates execution time
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        /* COMMENT OR UNCOMMENT to view or not view Sorted array */
        System.out.println("Sorted Array: " + Arrays.toString(array));

        System.out.println("Execution Time: " + executionTime + " milliseconds");

        scanner.close();
    }

    // Generate a random array of size elements with values between 1 and 200
    static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200) + 1; // Generates a random number between 1 and 200
        }

        /* COMMENT OR UNCOMMENT to view or not view Generated array */
        System.out.println("Generated Array: " + Arrays.toString(array));

        return array;
    }

    private static SortingAlgorithmInterface getSortingAlgorithm(int choice) {
        switch (choice) {
            case 1:
                return new BubbleSort();
            case 2:
                return new MergeSort();
            case 3:
                return new QuickSort();
            case 4:
                return new SelectionSort();
            case 5:
                return new InsertionSort();
            case 6:
                return new HeapSort();
            case 7:
                return new ShellSort();
            default:
                throw new IllegalArgumentException("Invalid choice.");
        }
    }
}
