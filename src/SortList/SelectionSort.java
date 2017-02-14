package SortList;

import java.util.ArrayList;

public class SelectionSort {

	private static ArrayList<Integer> Selection;

	public SelectionSort(ArrayList<Integer> Dados) {
		Selection = Dados;
	}

	public void sort() {
		Selection = Selectionsort(Selection);
	}

	private static ArrayList<Integer> Selectionsort(ArrayList<Integer> Selection) {
		selectionsort(Selection);
		return Selection;
	}

	private static void selectionsort(ArrayList<Integer> Selection) {

		int i;
		int j;

		for (i = 0; i < Selection.size() - 1; i++) {

			int indiceMenor = i;
			for (j = i + 1; j < Selection.size(); j++) {
				if (Selection.get(j) < Selection.get(indiceMenor)) {
					indiceMenor = j;
				}
			}

			int temp = Selection.get(i);
			Selection.set(i, Selection.get(indiceMenor));
			Selection.set(indiceMenor, temp);

		}

	}

	public void show() {
		System.out.println("SelectionSorted:");
		System.out.print(Selection);
	}
}