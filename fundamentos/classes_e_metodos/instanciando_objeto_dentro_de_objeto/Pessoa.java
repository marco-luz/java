package classes_e_metodos;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String mensagem() {
		return "Olá eu sou o " + nome + " e peso " + peso + "Kg.";
	}
}
