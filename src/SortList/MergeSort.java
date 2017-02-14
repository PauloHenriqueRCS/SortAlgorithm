package SortList;

import java.util.*;

public class MergeSort {

	private static ArrayList<Integer> Merge;

	public  MergeSort(ArrayList<Integer> Dados) {
		Merge = Dados;
	}

	public void sort() {
		Merge = mergesort(Merge);
	}

	private  static ArrayList<Integer> mergesort(ArrayList<Integer> Merge) {
		ArrayList<Integer> Esquerdo = new ArrayList<>();
		ArrayList<Integer> Direito = new ArrayList<>();
		int centro;

		if (Merge.size() == 1) {
			return Merge;
		} else {
			centro = Merge.size() / 2;
			for (int i = 0; i < centro; i++) {
				Esquerdo.add(Merge.get(i));
			}

			for (int i = centro; i < Merge.size(); i++) {
				Direito.add(Merge.get(i));
			}

			Esquerdo = mergesort(Esquerdo);
			Direito = mergesort(Direito);
			merge(Esquerdo, Direito, Merge);
		}
		return Merge;
	}

	private static void merge(ArrayList<Integer> Esquerdo, ArrayList<Integer> Direito, ArrayList<Integer> Merge) {
		int EsquerdoIndex = 0;
		int rightIndex = 0;
		int MergeIndex = 0;

		while (EsquerdoIndex < Esquerdo.size() && rightIndex < Direito.size()) {
			if ((Esquerdo.get(EsquerdoIndex).compareTo(Direito.get(rightIndex))) < 0) {
				Merge.set(MergeIndex, Esquerdo.get(EsquerdoIndex));
				EsquerdoIndex++;
			} else {
				Merge.set(MergeIndex, Direito.get(rightIndex));
				rightIndex++;
			}
			MergeIndex++;
		}

		ArrayList<Integer> rest;
		int restIndex;
		if (EsquerdoIndex >= Esquerdo.size()) {

			rest = Direito;
			restIndex = rightIndex;
		} else {

			rest = Esquerdo;
			restIndex = EsquerdoIndex;
		}

		for (int i = restIndex; i < rest.size(); i++) {
			Merge.set(MergeIndex, rest.get(i));
			MergeIndex++;
		}
	}

	public void show() {
		System.out.println("MergeSorted:");
		System.out.print(Merge);
	}
}