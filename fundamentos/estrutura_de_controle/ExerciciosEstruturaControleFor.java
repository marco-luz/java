package estrutura_de_controle;

import java.util.Scanner;

public class ExerciciosEstruturaControleFor {

	/*
	// Desafio: Não pode usar valor numerico para controlar o laço!
	
	public static void main(String[] args) {
		
		for (String i = "#"; !i.equals("######"); i += "#") {
			
			System.out.println(i);
			
		}
	}*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (nota1 <= 10 && nota2 <= 10) {
			if (media >= 7.0) {
				System.out.printf("Média %.2f : Aprovado", media);
			} else if (media >= 4.0) { 
				System.out.printf("Média %.2f : Recuperação", media);
			} else {
				System.out.printf("Média %.2f : Reprovado", media);
			}
		} else {
			System.out.printf("Alguma nota inválida: primeira nota %.2f : segunda nota %.2f", nota1, nota2);
		}
		
		entrada.close();
		
	}
}
