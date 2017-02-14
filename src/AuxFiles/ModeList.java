package AuxFiles;
// Autor: Paulo Henrique Rodrigues da Cunha Santos 

import java.util.ArrayList;

import SortList.*;

public class ModeList {

	ArrayList<Integer> Dados = new ArrayList<Integer>();
	//FileRArrayList ImportDados = new FileRArrayList();
	
	public void Teste(String dir) {

		FileRArrayList.FileListINT(dir, Dados);
		
		// System.out.println("******************************");
		BubbleSort B = new BubbleSort(Dados);
		long Bubblestart = System.currentTimeMillis();
		B.sort();
		long Bubbledelay = System.currentTimeMillis() - Bubblestart;
		B.show();		
		System.out.printf("\nBubbleSort Demorou " + Bubbledelay + " milissegundos\n\n");
		// System.out.println("\n******************************");		

		
		InsertionSort I = new InsertionSort(Dados);
		long Insertionstart = System.currentTimeMillis();
		I.sort();
		long Insertiondelay = System.currentTimeMillis() - Insertionstart;
		I.show();		
		System.out.printf("\nInsertionSort Demorou " + Insertiondelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		SelectionSort S = new SelectionSort(Dados);
		long Selectionstart = System.currentTimeMillis();
		S.sort();
		long Selectiondelay = System.currentTimeMillis() - Selectionstart;
		S.show();
		System.out.printf("\nSelectionSort Demorou " + Selectiondelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		QuickSort Q = new QuickSort(Dados);
		long Quickstart = System.currentTimeMillis();
		Q.sort();
		long Quickdelay = System.currentTimeMillis() - Quickstart;
		Q.show();	
		System.out.printf("\nQuickSort Demorou " + Quickdelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		MergeSort M = new MergeSort(Dados);
		long Mergestart = System.currentTimeMillis();
		M.sort();
		long Mergedelay = System.currentTimeMillis() - Mergestart;
		 M.show();	
		System.out.printf("\nMergeSort Demorou " + Mergedelay + " milissegundos\n\n");
		// System.out.println("\n******************************");

		ShellSort Sh = new ShellSort(Dados);
		long Shellstart = System.currentTimeMillis();
		Sh.sort();
		long Shelldelay = System.currentTimeMillis() - Shellstart;
	    S.show();	
		System.out.printf("\nShellSort Demorou " + Shelldelay + " milissegundos\n\n");
	    // System.out.println("\n******************************");
		
		HeapSort H = new HeapSort(Dados);
		long Heapstart = System.currentTimeMillis();
		H.sort();
		long Heapdelay = System.currentTimeMillis() - Heapstart;
	    H.show();
		System.out.printf("\nHeapSort Demorou " + Heapdelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		GnomeSort G = new GnomeSort(Dados);
		long Gnomestart = System.currentTimeMillis();
		G.sort();
		long Gnomedelay = System.currentTimeMillis() - Gnomestart;
		G.show();	
		System.out.printf("\nGnomeSort Demorou " + Gnomedelay + " milissegundos\n\n");
		// System.out.println("\n******************************");

		CountingSort CS = new CountingSort(Dados);
		long Countingestart = System.currentTimeMillis();
		CS.sort();
		long Countingdelay = System.currentTimeMillis() - Countingestart;
		CS.show();	
		System.out.printf("\nCountingSort Demorou " + Countingdelay + " milissegundos\n\n");
		// System.out.println("\n******************************");

		RadixSort R = new RadixSort(Dados);
		long Radixstart = System.currentTimeMillis();
		R.sort();
		long Radixgdelay = System.currentTimeMillis() - Radixstart;
		R.show();	
		System.out.printf("\nRadixgSort Demorou " + Radixgdelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		BucketSort BK = new BucketSort(Dados);
		long Bucketstart = System.currentTimeMillis();
		BK.sort();
		long Bucketdelay = System.currentTimeMillis() - Bucketstart;
		BK.show();		
		System.out.printf("\nBucketSort Demorou " + Bucketdelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		CocktailSort CT = new CocktailSort(Dados);
		long Cocktailstart = System.currentTimeMillis();
		CT.sort();
		long Cocktaildelay = System.currentTimeMillis() - Cocktailstart;
		CT.show();		
		System.out.printf("\nCocktailSort Demorou " + Cocktaildelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		BogoSort BG = new BogoSort(Dados);
		long Bogostart = System.currentTimeMillis();
		BG.sort();
		long Bogodelay = System.currentTimeMillis() - Bogostart;
		BG.show();
		System.out.printf("\nBogoSort Demorou " + Bogodelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		CircleSort CrS = new CircleSort(Dados);
		long Circlestart = System.currentTimeMillis();
		CrS.sort();
		long Circledelay = System.currentTimeMillis() - Circlestart;
		CrS.show();	
		System.out.printf("\nCircleSort Demorou " + Circledelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		
		
		CombSort COMB = new CombSort(Dados);
		long Combestart = System.currentTimeMillis();
		COMB.sort();
		long Combdelay = System.currentTimeMillis() - Combestart;
		COMB.show();	
		System.out.printf("\nCombSort Demorou " + Combdelay + " milissegundos\n\n");
		// System.out.println("\n******************************");
		 
		Dados.clear();
	}

}
