package trabalho_Conta_Bancaria;

public interface Transacao {
	
	public void deposito(double valor);
	public boolean saque(double valor);
	public double saldo(); 			// public void saldo();
	public boolean transferencia (double valor, Conta conta);
	
	
	
//	public void deposito (double valor);
//	public boolean saque (double valor);
//	public void saldo ();
//	public double transferencia (double valor, Conta conta);

}
