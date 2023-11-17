package sortingProblems;

public class MergeSort {
    public static void main(String[] args) {
		int[] arr = {1,8,9,0,2,14,-3,11};
		
		mergeSort(arr);
		printArray(arr);

	}
	private static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void mergeSort(int[] arr) {
		if(arr.length <= 1) {
			return;
		}
		int n = arr.length;
		int b[] = new int[n/2];
		int c[] =  new int[n - n/2];
		for(int i=0;i<n/2;i++) {
			b[i] = arr[i];
		}
		
		for(int i=n/2;i<n;i++) {
			c[i-n/2] = arr[i];
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,arr);
	}
	private static void merge(int[] arr1, int[] arr2,int[] sortedarr) {
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				sortedarr[k] = arr1[i];
				i++;
				k++;
			}else {
				sortedarr[k] = arr2[j];
				j++;
				k++;
			}
		}
		if(i<arr1.length) {
			while(i<arr1.length) {
				sortedarr[k] = arr1[i];
				i++;
				k++;
			}
		}
		if(j<arr2.length) {
			while(j<arr2.length) {
				sortedarr[k] = arr2[j];
				j++;
				k++;
			}
		}
	}

}
