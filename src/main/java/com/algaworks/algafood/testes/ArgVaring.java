package com.algaworks.algafood.testes;

public class ArgVaring {

	
	public static void teste(String... argumentos) {
		for (String arg : argumentos) {
			System.out.println(arg);
		}
	}
	
	public static void main(String[] args) {		
		teste("Felipe", "Adejanny", "Paulo");
	}

}
