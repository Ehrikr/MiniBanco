 package fj11;

public class TestaConta {
	
		public static void main(String[] args) {
			
			Conta joao = new Conta();
			joao.deposita(50.0);
			
			try {
				joao.saca(100);
			} catch(SaldoInsuficienteException e){
				System.out.println("Saldo Insuficiente: " + e.getSaldoAtual());
			}
			catch (Exception e) {
				System.out.println("Um outro erro qualquer!");
			}
			System.out.println(joao.getSaldo());
		}
}
