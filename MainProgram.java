import java.util.Arrays;
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

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(array));

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

        System.out.println("Sorted Array: " + Arrays.toString(array));

        scanner.close();
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
