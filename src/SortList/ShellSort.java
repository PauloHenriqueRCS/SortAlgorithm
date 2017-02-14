package SortList;

import java.util.ArrayList;

public class ShellSort {

	private static ArrayList<Integer> Shell;

	public ShellSort(ArrayList<Integer> Dados) {
		Shell = Dados;
	}

	public void sort() {
		Shell = Shellsort(Shell);
	}
 
	private static  ArrayList<Integer> Shellsort(ArrayList<Integer> Shell) {
		shellSort(Shell);
		return Shell;
	}

	private static void shellSort(ArrayList<Integer> Shell) {
		int h = 1;
		int n = Shell.size();

		while (h < n)
			h = h * 3 + 1;
		h = h / 3;
		int c, j;
		while (h > 0) {
			for (int i = h; i < n; i++) {
				c = Shell.get(i);
				j = i;
				while (j >= h && Shell.get(j - h) > c) {
					Shell.set(j, j - h);
					j = j - h;
				}
				Shell.set(j, c);
			}
			h = h / 2;
		}
	}

	public void show() {
		System.out.println("ShellSorted:");
		System.out.print(Shell);
	}
}