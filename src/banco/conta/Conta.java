package banco.conta;

import banco.cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private final int agencia;
    private final int numero;
    private double saldo = 0;
    private final Cliente cliente;
    private final String tipoConta;

    // CONSTRUCTOR
    public Conta(Cliente cliente, String tipoConta) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println("\n=== Extrato Conta " + tipoConta + " ===");
        System.out.printf("Nome: %s %n", this.cliente.getNome());
        System.out.printf("Agencia: %d %n", this.agencia);
        System.out.printf("Numero: %d %n", this.numero);
        System.out.printf("Saldo: R$%.2f %n", this.saldo);
    }


    // GETTERS
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
