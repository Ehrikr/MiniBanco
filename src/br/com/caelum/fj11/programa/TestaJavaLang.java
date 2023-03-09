package br.com.caelum.fj11.programa;

import fj11.Conta;
import fj11.GuardadorDeObjetos;

public class TestaJavaLang {
	public static void main(String[] args) {
	
	Conta c1 = new Conta(500.0);
	Conta c2 = new Conta(700.0);
	
	GuardadorDeObjetos armario = new GuardadorDeObjetos();
	armario.adiciona(c1);
	armario.adiciona(c2);
	
	Conta c1noArmario = armario.pega(0);
	System.out.println(c1noArmario.getSaldo());
	
	}
}
