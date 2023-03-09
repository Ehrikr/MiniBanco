package fj11;

public class Cliente implements Autenticavel {

	private String nome;
	private String endereço;
	
	public boolean autentica(int senha) {
		return false;
	}
}
