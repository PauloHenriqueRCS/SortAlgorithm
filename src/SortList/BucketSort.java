package SortList;

import java.util.*;

public class BucketSort {

	private static ArrayList<Integer> Bucket;

	public BucketSort(ArrayList<Integer> Dados) {
		Bucket = Dados;
	}

	public void sort() {
		Bucket = Bucketsort(Bucket);
	}

	private static ArrayList<Integer> Bucketsort(ArrayList<Integer> Bucket) {
		bucketsort(Bucket);
		return Bucket;
	}

	@SuppressWarnings("unchecked")
	private static void bucketsort(ArrayList<Integer> Bucket) {

		int[] vetor = new int[Bucket.size()];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Bucket.get(i);
		}

		int maiorValor = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		int numBaldes = maiorValor / 5;

		@SuppressWarnings("rawtypes")
		LinkedList[] B = new LinkedList[numBaldes];

		for (int i = 0; i < numBaldes; i++) {
			B[i] = new LinkedList<Integer>();
		}

		// Coloca os valores no balde respectivo:
		for (int i = 0; i < vetor.length; i++) {
			int j = numBaldes - 1;
			while (true) {
				if (j < 0) {
					break;
				}
				if (vetor[i] >= (j * 5)) {
					B[j].add(vetor[i]);
					break;
				}
				j--;
			}
		}

		// Ordena e atualiza o vetor:
		int indice = 0;
		for (int i = 0; i < numBaldes; i++) {

			int[] aux = new int[B[i].size()];

			// Coloca cada balde num vetor:
			for (int j = 0; j < aux.length; j++) {
				aux[j] = (Integer) B[i].get(j);
			}

			selectionsort(aux); // algoritmo escolhido para ordenação.

			// Devolve os valores ao vetor de entrada:
			for (int j = 0; j < aux.length; j++, indice++) {
				vetor[indice] = aux[j];
			}
			Bucket.clear();
			for (int j = 0; j < vetor.length; j++) {
				Bucket.add(vetor[j]);
			}

		}
	}

	private static void selectionsort(int[] aux) {

		int i, j;

		for (i = 0; i < aux.length - 1; i++) {

			int indiceMenor = i;
			for (j = i + 1; j < aux.length; j++) {
				if (aux[j] < aux[indiceMenor]) {
					indiceMenor = j;
				}
			}

			int temp = aux[i];
			aux[i] = aux[indiceMenor];
			aux[indiceMenor] = temp;
		}

	}

	public void show() {
		System.out.println("BucketSorted:");
		System.out.print(Bucket);
	}
}