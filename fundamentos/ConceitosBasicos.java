package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConceitosBasicos {
	
	public static void main(String[] args) {
		
		// Definindo uma constante
		
		final double ajuste = 32;
		final double fator   = 5 / 9.0;
		
		double fahrenheit = 100;
		
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.println("celsius: " + celsius + "°C.");
		
		
		
		// Notação ponto (* não utilizada em tipos primitivos)
		
		String x = "Bom dia X"
				.replace("X", "Sr.")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(x);
		
		
		
		// Concatenação com printf
		
		var name = "Pedro";
		var sobrename = "Santos";
		var idades = 33;
		var salario = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				name, sobrename, idades, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", 
				name, sobrename, idades, salario);
		System.out.println(frase);
		
		
		
		// Console com Scanner
		
		Scanner entrada = new Scanner(System.in); // <- Inicio
		
		System.out.print("Digite um número qualquer: ");
		int numero = entrada.nextInt();
		entrada.nextLine(); 	//lê o "\n" que o teclado.nextInt() deixa para trás.
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%d %s %s tem %d anos.\n\n",
				numero, nome, sobrenome, idade);
		
		entrada.close();						  // <- Fim (quando declara um Scanner, deve fechar a variável)
		
		
		
		// Conversão inteiro para String
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		
		
		// Criando uma caixa de diálogo do Java Swing
		// Conversão String para inteiro
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		
		System.out.println("A soma é " + soma);
	}
}
