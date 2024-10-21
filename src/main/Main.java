package main;

import banco.Banco;
import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import banco.conta.Transacao;

public class Main {
    public static void main(String[] args) {
        // Criando o Banco
        System.out.println("---> Iniciando sistema de Banco <---");
        Banco banco = new Banco("Solare");
        System.out.println("Banco " + banco.getNome() + " criado com sucesso!\n");

        //Criando Metodo de Transação
        Transacao transacao = new Transacao();

        // Criando Clientes
        Cliente pedro = new Cliente("Pedro", "Rua Pedro, 10", "1234567890");
        Cliente lucas = new Cliente("Lucas", "Rua Teste, 20", "0987654321");

        // Criando Contas
        Conta cCorrente_Pedro = new ContaCorrente(pedro);
        Conta cPoupanca_Pedro = new ContaPoupanca(pedro);
        Conta cCorrente_Lucas = new ContaCorrente(lucas);

        // Adicionando Contas ao banco
        banco.adicionarConta(cCorrente_Pedro);
        banco.adicionarConta(cPoupanca_Pedro);
        banco.adicionarConta(cCorrente_Lucas);

        // Transferencias
        transacao.depositar(cPoupanca_Pedro, 50.08);
        transacao.transferir(cPoupanca_Pedro, cCorrente_Pedro, 40.54);
        transacao.transferir(cCorrente_Pedro, cCorrente_Lucas, 22.32);
        transacao.sacar(cCorrente_Lucas, 10.15);

        // Extrato das Contas
        cPoupanca_Pedro.imprimirExtrato();
        cCorrente_Pedro.imprimirExtrato();
        cCorrente_Lucas.imprimirExtrato();

        // Lista de Contas do Banco
        banco.listarContas();
    }
}