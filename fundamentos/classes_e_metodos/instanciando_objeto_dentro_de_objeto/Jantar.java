package classes_e_metodos;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João", 80);
		
		System.out.println(pessoa.mensagem());
		
		Comida comida1 = new Comida("Arroz", 0.2);
		Comida comida2 = new Comida("Feijão", 0.15);
		
		pessoa.Comer(comida1);
		System.out.println(pessoa.mensagem());
		
		pessoa.Comer(comida2);
		System.out.println(pessoa.mensagem());
	}
}
