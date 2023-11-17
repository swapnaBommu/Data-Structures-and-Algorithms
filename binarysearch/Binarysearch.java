package binarysearch;

public class Binarysearch {
    public static void main(String[] args) {
		int[] arr = {1,4,8,9,17,25,36};
		int value = 170;
		int index = binarySearch(arr,0,arr.length-1,value);
		System.out.println("The element is at index: "+index);
	}

	private static int binarySearch(int[] arr, int start, int end, int value) {
		if(start > end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid] == value) {
			return mid;
		}
		else if(arr[mid] > value) {
			return binarySearch(arr,start,mid-1,value);
		}else {

			return binarySearch(arr,mid+1,end,value);
		}
	}
}
