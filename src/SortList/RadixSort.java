package SortList;

import java.util.ArrayList;

public class RadixSort {

	private static ArrayList<Integer> Radix;

	public RadixSort(ArrayList<Integer> Dados) {
		Radix = Dados;
	}

	public void sort() {
		Radix = Radixsort(Radix);
	}

	private static ArrayList<Integer> Radixsort(ArrayList<Integer> Radix) {
		radixsort(Radix);
		return Radix;
	}

	private static void radixsort(ArrayList<Integer> Radix) {

		int[] old = new int[Radix.size()];
		for (int i = 0; i < old.length; i++) {
			old[i] = Radix.get(i);
		}
		// Loop for every bit in the integers
		for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
			// The array to put the partially sorted array into
			int[] tmp = new int[old.length];
			// The number of 0s
			int j = 0;

			// Move the 0s to the new array, and the 1s to the old one
			for (int i = 0; i < old.length; i++) {
				// If there is a 1 in the bit we are testing, the number will be
				// negative
				boolean move = old[i] << shift >= 0;

				// If this is the last bit, negative numbers are actually lower
				if (shift == 0 ? !move : move) {
					tmp[j] = old[i];
					j++;
				} else {
					// It's a 1, so stick it in the old array for now
					old[i - j] = old[i];
				}
			}

			// Copy over the 1s from the old array
			for (int i = j; i < tmp.length; i++) {
				tmp[i] = old[i - j];
			}

			// And now the tmp array gets switched for another round of sorting
			old = tmp;
		}

		Radix.clear();
		for (int i = 0; i < old.length; i++) {
			Radix.add(old[i]);
		}

	}

	public void show() {
		System.out.println("RadixSorted:");
		System.out.print(Radix);
	}
}