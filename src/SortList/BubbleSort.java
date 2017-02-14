package SortList;

import java.util.ArrayList;

public class BubbleSort {

	private static ArrayList<Integer> Bubble;

	public BubbleSort(ArrayList<Integer> Dados) {
		Bubble = Dados;
	}

	public void sort() {
		Bubble = Bubblesort(Bubble);
	}

	private static ArrayList<Integer> Bubblesort(ArrayList<Integer> Bubble) {
		bubblesort(Bubble);
		return Bubble;
	}

	private static void bubblesort(ArrayList<Integer> Bubble) {

		{
			int i, j, aux;
			for (i = 0; i < Bubble.size(); i++) {
				for (j = i + 1; j < Bubble.size(); j++) {
					if (Bubble.get(i) > Bubble.get(j)) {
						aux = Bubble.get(i);
						Bubble.set(i, Bubble.get(j));
						Bubble.set(j, aux);
					}
				}
			}
		}

	}

	public void show() {
		System.out.println("BubbleSorted:");
		System.out.print(Bubble);
	}
}