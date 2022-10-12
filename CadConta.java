package trabalho_Conta_Bancaria;

import java.util.ArrayList;
import java.util.List;

public class CadConta {
	
	List<Conta> conta_cliente = new ArrayList<Conta>(); // verificar a Importação do ArrayList
	
	public void criarCliente(Conta c) { // verificar 
		conta_cliente.add(c);
	}
}
