package SortList;

import java.util.*;

public class CountingSort {
	
	private static ArrayList<Integer> Counting;

	public CountingSort(ArrayList<Integer> Dados) {
		Counting = Dados;
	}

	public void sort() {
		Counting = Countingsort(Counting);
	}

	private static ArrayList<Integer> Countingsort(ArrayList<Integer> Counting) {
		countingSort(Counting);
		return Counting;
	}

	private static void countingSort(ArrayList<Integer> Counting) {

		int[] v = new int[Counting.size()];

		for (int i = 0; i < v.length; i++) {
			v[i] = Counting.get(i);
		}
		
		
		int maior = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i] > maior) {
				maior = v[i];
			}
		}

		// frequencia
		int[] c = new int[maior];
		for (int i = 0; i < v.length; i++) {
			c[v[i] - 1] += 1;
		}

		// cumulativa
		for (int i = 1; i < c.length; i++) {
			c[i] += c[i - 1];
		}

		Integer[] b = new Integer[v.length];
		for (int i = 0; i < b.length; i++) {
			b[c[v[i] - 1] - 1] = v[i];
			c[v[i] - 1]--;
		}

		for (int i = 0; i < b.length; i++) {
			v[i] = b[i];
		}

		Counting.clear();
		for (int i = 0; i < v.length; i++) {
			Counting.add(v[i]);
		}

	}

	public void show() {
		System.out.println("CountingSorted:");
		System.out.print(Counting);
	}
}
