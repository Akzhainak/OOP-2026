package BonusTask;

public class Main {
	 public static void main(String[] args) {
	        int[] arr = {4, 2, 7, 3, 2, 9, 0, 10, 7, 1, 4, 2, 5};

	        System.out.println("original array:");
	        CountingSort.printArray(arr);

	        int[] sorted = CountingSort.countingSort(arr);

	        System.out.println("sorted array:");
	        CountingSort.printArray(sorted);
	    }
}
