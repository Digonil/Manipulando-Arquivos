package br.com.udemy.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good afternoon", "Good nigth" };

		String path = "C:\\Users\\diego\\Documents\\out.txt";

		// Cria um arquivo novo, caso queira adicionar algo no fim do arquivo, usar
		// (path, true) no FileWriter.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();// Adiciona um pulo de linha.
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
