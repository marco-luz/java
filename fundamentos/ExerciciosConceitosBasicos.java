package fundamentos;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExerciciosConceitosBasicos {

public static void main(String[] args) {
	
		// * Comentar o código e executar cada trecho separadamente para uma melhor visualização
		
		// resolvendo o InputMismatchException para contornar o problema ao utilizar "," como separador decimal em vez de "."
		//Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		String nota1 = entrada.next().replace(",", ".");
		System.out.print("Digite a nota 2: ");
		String nota2 = entrada.next().replace(",", ".");
		System.out.print("Digite a nota 3: ");
		String nota3 = entrada.next().replace(",", ".");
		
		double media = (
				Double.parseDouble(nota1) +
				Double.parseDouble(nota2) +
				Double.parseDouble(nota3) ) / 3;

		System.out.println(media);
		
		System.out.println(Locale.getDefault());
		
		entrada.close();
		
		
		
		// Expressao Aritmetica
		
		int oper1sup = (int) Math.pow(6 * (3 + 2), 2);
		int oper1inf = 3 * 2;
		int oper1 = oper1sup / oper1inf;
		
		int oper2sup = (1 - 5) * (2 - 7);
		int oper2inf = 2;
		
		int oper2 = (int) Math.pow(oper2sup / oper2inf, 2);
		
		int superior = (int) Math.pow(oper1 - oper2, 3);
		int inferior = (int) Math.pow(10, 3);
		
		int resultado = superior / inferior;
		
		System.out.println(resultado);
		
		
		
		// Operador Ternário
		
		double nota = 7.6;
		String mediaFinal = nota >= 7.0 ? "aprovado." : "reprovado.";
		
		System.out.printf("O aluno está %s\n", mediaFinal);
		
		
		
		// Compararação de Strings (utilizar .equals)
		
		Scanner teclado = new Scanner(System.in);
		
		String str = teclado.next();
		
		System.out.println("2".equals(str.trim()));
		
		teclado.close();
		
		
		
		// Desafio Calculadora Simples
		
		String num1 = JOptionPane.showInputDialog("Digite o 1º número: ");
		String num2 = JOptionPane.showInputDialog("Digite o 2º número: ");
		String operando = JOptionPane.showInputDialog("Digite o operando: ");
		
		double val1 = Double.parseDouble(num1);
		double val2 = Double.parseDouble(num2);
		
		/*double result = operando.equals("+") ? val1 + val2 :
						operando.equals("-") ? val1 - val2 :
						operando.equals("*") ? val1 * val2 :
						operando.equals("/") ? val1 / val2 :
						0;
		*/
		double result = "+".equals(operando) ? val1 + val2 : 0;
		result = "-".equals(operando) ? val1 - val2 : result;
		result = "*".equals(operando) ? val1 * val2 : result;
		result = "/".equals(operando) ? val1 / val2 : result;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", val1, operando, val2, result);
	}
}
