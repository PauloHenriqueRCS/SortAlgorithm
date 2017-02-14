package SortList;

import java.util.*;

public class InsertionSort {

	private static ArrayList<Integer> Insertion;

	public InsertionSort(ArrayList<Integer> Dados) {
		Insertion = Dados;
	}

	public void sort() {
		Insertion = Insertionsort(Insertion);
	}

	private static ArrayList<Integer> Insertionsort(ArrayList<Integer> Insertion) {
		insertionsort(Insertion);
		return Insertion;
	}

	private static void insertionsort(ArrayList<Integer> Insertion) {

		int tmp;
		int fixo;

		for (int k = 1; k < Insertion.size(); k++) {
			tmp = Insertion.get(k);
			fixo = k;
			while (fixo > 0 && Insertion.get(fixo - 1) > tmp) {
				Insertion.set(fixo, Insertion.get(fixo - 1));
				fixo--;
			}
			Insertion.set(fixo, tmp);
		}
	}

	public void show() {
		System.out.println("InsertionSorted:");
		System.out.print(Insertion);
	}
}