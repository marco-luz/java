package estrutura_de_controle;

import java.util.Scanner;

public class ExerciciosEstruturaControle {

public static void main(String[] args) {
		
		// Dia da semana
		
		System.out.print("Digite um dia da semana: ");
		
		Scanner entrada = new Scanner(System.in);
		
		String semana = entrada.next();
		
		int dia = 0;
		
		if ("Domingo".equalsIgnoreCase(semana)) {
			dia = 1;
		} else if ("Segunda".equalsIgnoreCase(semana)) {
			dia = 2;
		} else if ("Terça".equalsIgnoreCase(semana)) {
			dia = 3;
		} else if ("Quarta".equalsIgnoreCase(semana)) {
			dia = 4;
		} else if ("Quinta".equalsIgnoreCase(semana)) {
			dia = 5;
		} else if ("Sexta".equalsIgnoreCase(semana)) {
			dia = 6;
		} else if ("Sabado".equalsIgnoreCase(semana)) {
			dia = 7;
		} else {
			System.out.println("Dia inválido");
		}
		
		System.out.println(dia);
		
		entrada.close();
		
		
		
		// While determinado
		
		Scanner digite = new Scanner(System.in);
		
		String condicao = "";
		
		while (!"sair".equalsIgnoreCase(condicao)) {
			System.out.print("Digite algo: ");
			condicao = digite.next();
		}
		
		System.out.println("Fim!!!");
		
		digite.close();
		
		
		
		
		// Notas válidas
		
		Scanner entradas = new Scanner(System.in);

		double nota = 0;
		double soma = 0;
		
		int contador = 0;
		
		while (nota != -1) {
			
			System.out.print("Digite uma nota: ");
			
			nota = entradas.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				soma = soma + nota;
				contador++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!");
			}
		}
		
		double media = soma / contador;
		
		System.out.printf("Foram %d notas válidas com uma média de %.2f.", contador, media);

		entradas.close();
		
	}
}
