package test1;

public class bubbleSortTest {

	public static void bubbleSort(int[] arr) {
		
		int a = arr.length;
		
		for(int i = 0; i < n - 1; i++) {
			
			for(int j = 0; j < n - 1 - i; j++) {
				
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] data = {};
	}
}
