
public class TestaCondicional2 {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");
		int idade = 13;
		int QuantidadePessoas = 2;
		boolean acompanhado = QuantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado) {

			System.out.println("Voc� tem mais que 18 anos ou est� acompanhado!");
			System.out.println("Seja bem vindo");

		} else {

		System.out.println("Infelizmente voc� n�o pode entrar!");
			
		}
	}
}
