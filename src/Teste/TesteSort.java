package Teste;

import java.util.*;

import AuxFiles.*;

public class TesteSort {
	private static Scanner a;
	private static Scanner sd;

	public static void main(String[] args) {

		//Integer opo;
		String dir = "vetor.txt";
		ModeList teste = new ModeList();
		System.out.println("Teste de velocidade de algoritimos de ordenação\n");
		teste.Teste(dir);
	/*	do {
			System.out.println("Selecione o algoritimo para teste:\n"
					+ " 1. Iniciar \n 2. Sair");
			a = new Scanner(System.in);
			opo = Integer.parseInt(a.nextLine());

			switch (opo) {

			case 1:
				System.out.println("Digite o nome do arquivo de dados:");
				sd = new Scanner(System.in);
				dir = sd.nextLine();
				ModeList teste = new ModeList();
				teste.Teste(dir);
				break;
			case 2:
				break;
			default:
				System.out.println("Op��o invalida!");
				break;
			}
			System.out.println(" Digite '1' para testar outro arquivo ou digite '0' para terminar. ");
			a = new Scanner(System.in);
			opo = Integer.parseInt(a.nextLine());
		} while (opo != 0);
	*/
	}
}
