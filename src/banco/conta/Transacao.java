package banco.conta;

public class Transacao {

    // Método para sacar
    public void sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Foi sacado o valor de R$" + valor + " da conta " + conta.getTipoConta() + " do " +
                    "cliente " + conta.getCliente().getNome());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Método para depositar
    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Foi depositado o valor de R$" + valor + " na conta " + conta.getTipoConta() + " do " +
                "cliente " + conta.getCliente().getNome());
    }

    // Método para transferir
    public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem.getSaldo() >= valor) {
            this.sacar(contaOrigem, valor);
            this.depositar(contaDestino, valor);
            System.out.println(
                    "Foi transferido com sucesso o valor de R$" + valor + " da conta " +
                    contaOrigem.getTipoConta() + " do cliente " + contaOrigem.getCliente().getNome() +
                    " para a conta " + contaDestino.getTipoConta() + " do cliente " +
                    contaDestino.getCliente().getNome()
            );
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}
