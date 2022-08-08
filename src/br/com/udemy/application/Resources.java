package br.com.udemy.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resources {

	public static void main(String[] args) {

		String path = "C:\\Users\\diego\\Documents\\in.txt";

		//Instanciação do BR e do FR será feito direto no try
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
