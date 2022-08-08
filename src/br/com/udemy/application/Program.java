package br.com.udemy.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\diego\\Documents\\in.txt");// Indica o arquivo que ser� lido.
		Scanner sc = null;// Inst�ncia o scanner que ir� ler o arquivo.
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());// O While verifica se tem conte�do na pr�xima linha, caso true, o sc
													// l� a pr�xima linha.
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();//Necess�rio verificar se o scanner est� instanciado.
			}

		}
	}
}