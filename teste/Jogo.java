package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo extends Jogador {

	public static void main(String[] args) {
		
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);

		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println(heroi.vida);
		System.out.println(monstro.vida);
		
	}
}
