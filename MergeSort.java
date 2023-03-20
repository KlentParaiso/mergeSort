
package javaapplication1;


public class MergeSort {
       public static void main(String args[])
     {   	
    
        int[] array = {6, 9, 8, 7, 2, 4, 5, 3};
        
        mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

	private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; 
		
		int middle = length / 2;
		int[] leftArr = new int[middle];
		int[] rightArr = new int[length - middle];
		
		int i = 0; 
		int j = 0; 
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArr[i] = array[i];
			}
			else {
				rightArr[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, array);
	}
	
	private static void merge(int[] leftArr, int[] rightArr, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; 
		
		
		while(l < leftSize && r < rightSize) {
			if(leftArr[l] < rightArr[r]) {
				array[i] = leftArr[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArr[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArr[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArr[r];
			i++;
			r++;
		}
	}
}


