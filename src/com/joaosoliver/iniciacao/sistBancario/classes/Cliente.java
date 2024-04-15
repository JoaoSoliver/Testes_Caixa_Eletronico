package com.joaosoliver.iniciacao.sistBancario.classes;

public class Cliente {
	
	private String nome;
	private String tipoDeConta;
	private double saldo;
	private int numeroDaConta;
	Operacoes operacoes = new Operacoes();
	
	public Cliente(String nome, String tipoDeConta, double saldo, int numeroDaConta) {
		this.nome = nome;
		this.tipoDeConta = tipoDeConta;
		this.saldo = saldo;
		this.numeroDaConta = numeroDaConta;
	}
	
//	public void transferir(double valor) {		
//		if (valor <= this.saldo && valor > 0) {
//			this.saldo -= valor;	
//			System.out.println("Transferindo " + valor + " dinheiros");
//		} else if (valor < 0) {
//			System.out.println("Operação inválida...");
//		} else {
//			System.out.println("Saldo insuficiente para realizar essa transação");
//		}
//	}
	
	
	
//	public void depositar(double valor) {
//		if (valor < 0) {
//			System.out.println("Operação inválida...");
//		} else {
//			this.saldo += valor;
//			System.out.println("Depositando " + valor + " dinheiros");
//		}
//	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	@Override
	public String toString() {
		return "\n"
				+ "Cliente: " + nome + "\nConta: " + tipoDeConta + "\nSaldo: " + saldo + "\n#####################";
	}
	
}
