package BonusTask;

public class CountingSort {
	 public static int[] countingSort(int[] arr) {
	        int[] count = new int[11]; // for numbers 0..10

	        for (int i = 0; i < arr.length; i++) {
	        	int num = arr[i];
	            count[num]++;
	        }

	        int[] sorted = new int[arr.length];
	        int index = 0;

	        for (int i = 0; i <= 10; i++) {
	            while (count[i] > 0) {
	                sorted[index] = i;
	                index++;
	                count[i]--;
	            }
	        }

	        return sorted;
	    }

	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	        	System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}
