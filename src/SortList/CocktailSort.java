package SortList;

import java.util.ArrayList;


public class CocktailSort {
	
	private static ArrayList <Integer> Cocktail;

	public CocktailSort (ArrayList<Integer> Dados) {
		Cocktail = Dados;
	}

	public void sort() {
		Cocktail = Cocktailsort(Cocktail);
	}

	private static ArrayList<Integer> Cocktailsort(ArrayList<Integer> Cocktail) {
		cocktailsort(Cocktail);
		return Cocktail;
	}

	private static void cocktailsort(ArrayList<Integer> Cocktail) {

		boolean swapped;
		do {
			swapped = false;
			for (int i =0; i<=  Cocktail.size()  - 2;i++) {
				if (Cocktail.get(i) > Cocktail.get(i + 1)) {
					//test whether the two elements are in the wrong order
					int temp = Cocktail.get(i);
					Cocktail.set(Cocktail.get(i), Cocktail.get(i + 1));
					Cocktail.set(Cocktail.get(i + 1), temp);
					swapped = true;
				}
			}
			if (!swapped) {
				//we can exit the outer loop here if no swaps occurred.
				break;
			}
			swapped = false;
			for (int i= Cocktail.size() - 2;i>=0;i--) {
				if (Cocktail.get(i) > Cocktail.get(i + 1)) {
					int temp = Cocktail.get(i);
					Cocktail.set(Cocktail.get(i), Cocktail.get(i + 1));
					Cocktail.set(Cocktail.get(i + 1), temp);
					swapped = true;
				}
			}
			//if no elements have been swapped, then the list is sorted
		} while (swapped);
		
	}

	public void show() {
		System.out.println("CocktailSorted:");
		System.out.print(Cocktail);
	}
}