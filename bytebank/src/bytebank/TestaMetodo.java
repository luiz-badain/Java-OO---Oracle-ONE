package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLuiz = new Conta();
		contaDoLuiz.saldo = 100;
		contaDoLuiz.deposita(50);
		System.out.println(contaDoLuiz.saldo);
		boolean conseguiuRetirar = contaDoLuiz.saca(20);
		System.out.println(contaDoLuiz.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoLuiz)){
			System.out.println("transferencia com sucesso");
		
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLuiz.saldo);
		
		contaDoLuiz.titular = "Luiz Badain";
		System.out.println(contaDoLuiz.titular);
		
	}

}
