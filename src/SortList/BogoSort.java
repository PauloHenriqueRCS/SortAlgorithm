package SortList;

import java.util.ArrayList;

public class BogoSort {
	
	private static ArrayList<Integer> Bogo;

	public BogoSort(ArrayList<Integer> Dados) {
		Bogo = Dados;
	}

	public void sort() {
		Bogo = Bogosort(Bogo);
	}

	private static ArrayList<Integer> Bogosort(ArrayList<Integer> Bogo) {
		bogosort(Bogo);
		return Bogo;
	}

	private static void bogosort(ArrayList<Integer> Bogo) {

		@SuppressWarnings("unused")
		int shuffle = 1;
		for (; !isSorted(Bogo); shuffle++)
			shuffle(Bogo);

	}

	private static void shuffle(ArrayList<Integer> Bogo) {
		// Standard Fisher-Yates shuffle algorithm
		int i = Bogo.size() - 1;
		while (i > 0)
			swap(Bogo, i--, (int) (Math.random() * i));
	}

	private static void swap(ArrayList<Integer> Bogo, int i, int j) {
		int temp = Bogo.get(i);
		Bogo.set(Bogo.get(i), Bogo.get(j));
		Bogo.set(Bogo.get(j), temp);
	}

	private static boolean isSorted(ArrayList<Integer> Bogo) {

		for (int i = 1; i < Bogo.size(); i++)
			if (Bogo.get(i) < Bogo.get(i - 1))
				return false;
		return true;
	}

	public void show() {
		System.out.println("BogoSorted:");
		System.out.print(Bogo);
	}
}