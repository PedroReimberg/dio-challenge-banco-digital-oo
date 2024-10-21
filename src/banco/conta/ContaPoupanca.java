package banco.conta;

import banco.cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente, "Poupança");
    }

    public void imprimirExtrato(){
        super.imprimirInfosComuns();
    }
}
