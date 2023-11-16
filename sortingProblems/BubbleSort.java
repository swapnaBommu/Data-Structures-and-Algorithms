package sortingProblems;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {10,85,-5,-6,14,7,13,26};
        bubbleSort(arr);
        printArray(arr);
    }
    private static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
