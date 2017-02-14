
package AuxFiles;

import java.io.*;
import java.util.*;

public class FileRArrayList {

	public static void FileSTR(String diretorio, List<String> Dados) {
		try {
			BufferedReader BuffFileopen = new BufferedReader(new FileReader(diretorio));
			while (BuffFileopen.ready()) {
				String linha = BuffFileopen.readLine();
				while (linha != null) {
					Dados.add(linha);
					linha = BuffFileopen.readLine();
				}
			}
			BuffFileopen.close();
		} catch (FileNotFoundException erro) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", erro.getMessage());
		} catch (IOException erro) {
			System.err.printf("Erro: %s.\n", erro.getMessage());
		}
	}

	public static void FileArrayINT(String diretorio, Integer[] Dados) {
		try {
			BufferedReader BuffFileopen = new BufferedReader(new FileReader(diretorio));
			while (BuffFileopen.ready()) {
				String linha = BuffFileopen.readLine();
				List<Integer> aux = new ArrayList<Integer>();
				while (linha != null) {
					aux.add(Integer.parseInt(linha));
					linha = BuffFileopen.readLine();				
				}			
				for (Integer i = 0; i < aux.size(); i++) {
					Dados[i] = aux.get(i);
				}				
			}
			BuffFileopen.close();
		} catch (FileNotFoundException erro) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", erro.getMessage());
		} catch (IOException erro) {
			System.err.printf("Erro: %s.\n", erro.getMessage());
		}
	}

	public static void FileListINT(String diretorio, List<Integer> Dados) {
		try {
			BufferedReader BuffFileopen = new BufferedReader(new FileReader(diretorio));
			while (BuffFileopen.ready()) {
				String linha = BuffFileopen.readLine();
				while (linha != null) {
					Dados.add(Integer.parseInt(linha));
					linha = BuffFileopen.readLine();
				}
			}
			BuffFileopen.close();
		} catch (FileNotFoundException erro) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", erro.getMessage());
		} catch (IOException erro) {
			System.err.printf("Erro: %s.\n", erro.getMessage());
		}
	}

}
