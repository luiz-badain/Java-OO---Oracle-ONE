package sitaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		//boolean acompanhado = quantidadePessoas >=2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >=2) {
			 acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} 
		else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}

}
