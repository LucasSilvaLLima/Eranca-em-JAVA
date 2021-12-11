package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Teste extends Carro {

	Teste(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public static void main(String[] args) {
		
		Civic civic = new Civic(200);
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(civic.velocidadeAtual);
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		System.out.println(civic.velocidadeAtual);
		
		
		Carro ferrari = new Ferrari(390);

		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println(ferrari.velocidadeAtual);

		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		System.out.println(ferrari.velocidadeAtual);
	}
}
