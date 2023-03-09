package fj11;

class Gerente extends Funcionario implements Autenticavel {
	
	public double getBonus() {
		return this.salario * 0.3;
	}
	public void cobraEntrega() {
		System.out.println("Está Pronto?");
	}
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
