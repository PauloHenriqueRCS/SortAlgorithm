
package SortList;

import java.util.ArrayList;
import java.util.Collections;

public class HeapSort {

	private static ArrayList<Integer> Heap;

	public HeapSort(ArrayList<Integer> Dados) {
		Heap = Dados;
	}

	public void sort() {
		Heap = Heapsort(Heap);
	}

	private static ArrayList<Integer> Heapsort(ArrayList<Integer> Heap) {
		heapsort(Heap);
		return Heap;
	}

	private static void heapsort(ArrayList<Integer> Heap) {

		for (int heapsize = 0; heapsize < Heap.size(); heapsize++) {

			int n = heapsize;
			while (n > 0) {
				int p = (n - 1) / 2;
				if (Heap.get(n) > Heap.get(p)) {
					Collections.swap(Heap, n, p);
					n = p;
				} else
					break;
			}
		}

		for (int heapsize = Heap.size(); heapsize > 0;) {
			Collections.swap(Heap, 0, --heapsize);
			int n = 0;
			while (true) {
				int left = (n * 2) + 1;
				if (left >= heapsize)
					break;
				int right = left + 1;
				if (right >= heapsize) {
					if (Heap.get(left) > Heap.get(n))
						Collections.swap(Heap, left, n);
					break;
				}
				if (Heap.get(left) > Heap.get(n)) {
					if (Heap.get(left) > Heap.get(right)) {
						Collections.swap(Heap, left, n);
						n = left;
						continue;
					} else {
						Collections.swap(Heap, right, n);
						n = right;
						continue;
					}
				} else {
					if (Heap.get(right) > Heap.get(n)) {
						Collections.swap(Heap, right, n);
						n = right;
						continue;
					} else {
						break;
					}
				}
			}
		}
	}

	public void show() {
		System.out.println("HeapSorted:");
		System.out.print(Heap);
	}

}
