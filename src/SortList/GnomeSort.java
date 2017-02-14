package SortList;

import java.util.ArrayList;
import java.util.Collections;

public class GnomeSort {

	private static ArrayList<Integer> Gnome;

	public GnomeSort(ArrayList<Integer> Dados) {
		Gnome = Dados;
	}

	public void sort() {
		Gnome = Gnomesort(Gnome);
	}

	private static ArrayList<Integer> Gnomesort(ArrayList<Integer> Shell) {
		gnomeSort(Gnome);
		return Gnome;
	}

	private static void gnomeSort(ArrayList<Integer> Gnome) {

		int pivot = 0;
		int aux;
		while (pivot < (Gnome.size() - 1)) {
			if (Gnome.get(pivot) > Gnome.get(pivot + 1)) {
				aux = Gnome.get(pivot);
				Collections.swap(Gnome, pivot, pivot + 1);
				Collections.swap(Gnome, pivot + 1, aux);
				if (pivot > 0) {
					pivot -= 2;
				}
			}
			pivot++;
		}
	}

	public void show() {
		System.out.println("GnomeSorted:");
		System.out.print(Gnome);
	}
}
