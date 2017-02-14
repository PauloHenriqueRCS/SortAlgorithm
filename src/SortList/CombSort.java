package SortList;

import java.util.ArrayList;

public class CombSort {
	
	private static ArrayList<Integer> Comb;

	public CombSort(ArrayList<Integer> Dados) {
		Comb = Dados;
	}

	public void sort() {
		Comb = Combsort(Comb);
	}

	private static ArrayList<Integer> Combsort(ArrayList<Integer> Comb) {
		combsort(Comb);
		return Comb;
	}

	private static void combsort(ArrayList<Integer> Comb) {

		int[] arr = new int[Comb.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Comb.get(i);
		}

		double shrinkFactor = 1.3;
		if (arr.length > 0) {
			double gap = (arr.length - 1) / shrinkFactor;

			while (gap > 1) {
				int i = 0;
				int j = (int) (i + Math.floor(gap));
				while (j != arr.length) {
					if (arr[i] > arr[j]) {
						arr[i] = arr[i] ^ arr[j];
						arr[j] = arr[j] ^ arr[i];
						arr[i] = arr[i] ^ arr[j];
					}
					i++;
					j++;
				}
				gap = gap / shrinkFactor;
			}
		}
		Comb.clear();
		for (int j = 0; j < arr.length; j++) {
			Comb.add(arr[j]);
		}

	}

	public void show() {
		System.out.println("CombSorted:");
		System.out.print(Comb);
	}
}