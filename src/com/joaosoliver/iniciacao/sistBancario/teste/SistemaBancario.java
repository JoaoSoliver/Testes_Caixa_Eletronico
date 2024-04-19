package com.joaosoliver.iniciacao.sistBancario.teste;

import java.util.Scanner;

import com.joaosoliver.iniciacao.sistBancario.classes.Cliente;
import com.joaosoliver.iniciacao.sistBancario.classes.Conta;
import com.joaosoliver.iniciacao.sistBancario.classes.Operacoes;

public class SistemaBancario {

	public static void main(String[] args) {

		int operacoes = 0;

		Scanner sc = new Scanner(System.in);
		double valores = 0;
		
		Operacoes operacoesFinanceiras = new Operacoes();

		Cliente c1 = new Cliente("Joe Hunter", "123456");
		Cliente c2 = new Cliente("Hellen Vintage","456789");
		
		Conta contaJoe = new Conta(c1, 25000);
		Conta contaHellen = new Conta(c2, 15300);

		System.out.println(contaJoe);
		System.out.println(contaHellen);

		System.out.println("\nBem vindo(a)");
		
		contaJoe.transferir(100, contaHellen);
		
		System.out.println(contaJoe);
		System.out.println(contaHellen);
		
		contaJoe.transferirComNumeroConta(100, 456789);
		
		System.out.println(contaJoe);
		System.out.println(contaHellen);
//		System.out.println("\nSaldo atual: " + c1.getSaldo());
//		System.out.println("\nSaldo atual: " + c2.getSaldo());
		
//		operacoesFinanceiras.depositar(123456, 10);
		
//		System.out.println("\nSaldo atual: " + c1.getSaldo());
		
//		while (operacoes != 4) {
//			System.out.println("\nComo posso ajudar?");
//			System.out.println("\nOPERAÇÕES");
//			System.out.println("1 - Consultar saldo");
//			System.out.println("2 - Depositar");
//			System.out.println("3 - Tranferir");
//			System.out.println("4 - Sair \n");
//			
//			operacoes = sc.nextInt();

//			if (operacoes == 1) {
//				System.out.println("Saldo atual: " + c1.getSaldo());
//			} else if (operacoes == 2){
//				System.out.println("Informe o valor para depósito: ");
//				valores = sc.nextDouble();
//				System.out.println("Transferir para conta do: ");
//				c1.depositar(valores);				
//			} else if (operacoes == 3){
//				System.out.println("Informe o valor para transferir: ");
//				valores = sc.nextDouble();
////				operacoesFinanceiras.transferir(c2, valores);
//			} else if(operacoes == 4) {
//				System.out.println("Encerrando a aplicação...");
//			} else {
//				System.out.println("Opção inválida !!!");
//			}
		}
//		sc.close();
//	}
}
