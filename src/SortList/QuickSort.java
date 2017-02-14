
package SortList;

import java.util.*;

public class QuickSort {

	private static ArrayList<Integer> Quick;

	public QuickSort(ArrayList<Integer> Dados) {
		Quick = Dados;
	}

	public void sort() {
		Quick = Quicksort(Quick);
	}

	private static  ArrayList<Integer> Quicksort(ArrayList<Integer> Quick) {
		quicksort(Quick, 0, Quick.size() - 1);
		return Quick;
	}

	private static void quicksort(ArrayList<Integer> Quick, int Inicio, int Fim) {
		int posicaoPivo;
		if (Inicio < Fim) {
			posicaoPivo = partition(Quick, Inicio, Fim);
			quicksort(Quick, Inicio, posicaoPivo - 1);
			quicksort(Quick, posicaoPivo + 1, Fim);
		}
	}

	private static int partition(ArrayList<Integer> Quick, int Esquerdo, int Direito) {
		int P = Quick.get(Esquerdo);
		int i = Esquerdo;
		int j = Direito + 1;
		for (;;) {
			while (Quick.get(++i) < P) {
				if (i >= Direito) {
					break;
				}
			}
			while (Quick.get(--j) > P) {
				if (j <= Esquerdo) {
					break;
				}
			}
			if (i >= j) {
				break;
			} else {
				Collections.swap(Quick, i, j);
			}
		}
		if (j == Esquerdo) {
			return j;
		}
		Collections.swap(Quick, Esquerdo, j);
		return j;
	}

	public void show() {
		System.out.println("QuickSorted:");
		System.out.print(Quick);
	}

}