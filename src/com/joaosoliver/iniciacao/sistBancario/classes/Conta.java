package com.joaosoliver.iniciacao.sistBancario.classes;

public class Conta {
	
	private Cliente cliente;
	private String tipoDeConta;
	private double saldo;
	private int numeroDaConta;
	
	public Conta(Cliente cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public void transferir(double valor) {		
	if (valor <= this.saldo && valor > 0) {
		this.saldo -= valor;	
		System.out.println("Transferindo " + valor + " dinheiros");
	} else if (valor < 0) {
		System.out.println("Operação inválida...");
	} else {
		System.out.println("Saldo insuficiente para realizar essa transação");
	}
}
	
	@Override
	public String toString() {
		return "Conta [cliente=" + cliente.getNome() + ", tipoDeConta=" + tipoDeConta + ", saldo=" + saldo + ", numeroDaConta="
				+ numeroDaConta ;
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

}
