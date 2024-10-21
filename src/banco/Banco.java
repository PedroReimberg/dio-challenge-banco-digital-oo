package banco;

import banco.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    // GETTERS/SETTERS
    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Listar Contas
    public void listarContas() {
        if (contas == null || contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada no banco " + nome);
            return;
        }

        System.out.println("\n=== Listagem de Contas do Banco " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println("Tipo da conta: " + conta.getTipoConta());
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Titular: " + conta.getCliente().getNome());
            System.out.println("Saldo: R$ " + String.format("%.2f", conta.getSaldo()));
            System.out.println("----------------------------------------------");
        }
    }
}
