import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Santander");
		
		Cliente jaqueline = new Cliente();
		jaqueline.setNome("Jaqueline");
		jaqueline.setTelefone("21 912345678");
		
		Conta cc = new ContaCorrente(jaqueline);
		Conta poupanca = new ContaPoupanca(jaqueline);
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(poupanca);
		contas.add(cc);
		banco.setContas(contas);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		for(Cliente cliente : banco.listarClientes()) {
			System.out.println(String.format("Nome do Cliente: %s", cliente.getNome()));
			System.out.println(String.format("Telefone do Cliente: %s", cliente.getTelefone()));
		}
	}

}
