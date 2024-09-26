package Programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\marco.rosa\\Desktop\\desafio\\Pessoas.txt";
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String linha = br.readLine();
			linha = br.readLine();
			while (linha != null) {
				
				String[] vect = linha.split(",");
				String nome = vect[0];
				Integer idade = Integer.parseInt(vect[1]);
				String cpf = vect[2];
				
				Pessoa prod = new Pessoa(nome, idade, cpf);
				list.add(prod);
				
				linha = br.readLine();
			}	
			
			System.out.println("Usuario:");
			for (Pessoa p : list) {
				System.out.println(p);
			}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
