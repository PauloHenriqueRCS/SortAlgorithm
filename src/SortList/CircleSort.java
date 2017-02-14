package SortList;

import java.util.*;

public class CircleSort {
	
	private static ArrayList <Integer> Circle;

	public CircleSort (ArrayList<Integer> Dados) {
		Circle = Dados;
	}

	public void sort() {
		Circle = Circlesort(Circle);
	}

	private static ArrayList<Integer> Circlesort(ArrayList<Integer> Circle) {
		circlesort(Circle);
		return Circle;
	}

	private static void circlesort(ArrayList<Integer> Circle) {

		int[] arr = new int[Circle.size()];
		for (int index = 0; index < arr.length; index++){
			arr[index] = Circle.get(index);
		}
		if (arr.length > 0)
            do {
                //System.out.println(Arrays.toString(arr));
            } while (circleSortR(arr, 0, arr.length - 1, 0) != 0);
		
		Circle.clear();
		for (int index = 0; index < arr.length; index++){
			Circle.add(arr[index]);
		}
		
	}
	
	private  static int circleSortR(int[] arr, int lo, int hi, int numSwaps) {
        if (lo == hi)
            return numSwaps;
 
        int high = hi;
        int low = lo;
        int mid = (hi - lo) / 2;
 
        while (lo < hi) {
            if (arr[lo] > arr[hi]) {
                swap(arr, lo, hi);
                numSwaps++;
            }
            lo++;
            hi--;
        }
 
        if (lo == hi && arr[lo] > arr[hi + 1]) {
            swap(arr, lo, hi + 1);
            numSwaps++;
        }
 
        numSwaps = circleSortR(arr, low, low + mid, numSwaps);
        numSwaps = circleSortR(arr, low + mid + 1, high, numSwaps);
 
        return numSwaps;
    }
 
    private static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

	public void show() {
		System.out.println("CircleSorted:");
		System.out.print(Circle);
	}
}