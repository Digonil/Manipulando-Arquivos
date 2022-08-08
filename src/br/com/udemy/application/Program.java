package br.com.udemy.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\diego\\Documents\\in.txt");// Indica o arquivo que será lido.
		Scanner sc = null;// Instância o scanner que irá ler o arquivo.
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());// O While verifica se tem conteúdo na próxima linha, caso true, o sc
													// lê a próxima linha.
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();//Necessário verificar se o scanner está instanciado.
			}

		}
	}
}