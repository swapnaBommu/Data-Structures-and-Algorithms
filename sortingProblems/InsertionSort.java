package sortingProblems;

public class InsertionSort {
    public static void main(String[] args) {
		int[] arr = {10,8,1,7,13,26};
	     insertionSort(arr);
	     printArray(arr);
	}
	private static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j >0 && arr[j-1] > arr[j]) {
            	int temp = arr[j-1];
            	arr[j-1] = arr[j];
            	arr[j] = temp;
            	j--;
            }
        }
    }
}
