/*selection sort problem */
package sortingProblems;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {10,85,-5,-6,14,7,13,26};
        selectionSort(arr);
        printArray(arr);
    }
    private static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
    private static void selectionSort(int[] arr) {
		int n =  arr.length;
		for(int i =0;i<n-1;i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			//finding minimum of the array
			for(int j = i; j<n;j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			//swap the min value to its correct position
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}	
	}
}
