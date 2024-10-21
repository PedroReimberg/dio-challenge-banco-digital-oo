package banco.conta;

import banco.cliente.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente, "Corrente");
    }

    public void imprimirExtrato(){
        super.imprimirInfosComuns();
    }
}
