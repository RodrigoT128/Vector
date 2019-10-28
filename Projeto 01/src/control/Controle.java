package control;

import model.*;

public class Controle {
	public static void main(String[] args) {
		
		Numeroextenso numero = new Numeroextenso();
		Modelo buscaparte = new Modelo();
		Integer[] digitos = buscaparte.getDigitos(Modelo.Ran());
		
		String parte1 = numero.extenso(buscaparte.getParte1(Modelo.Ran()));
		String parte2 = numero.extenso(buscaparte.getParte2(Modelo.Ran()));
		String conexaomil = " mil ";
		
		if (digitos.length >= 4) {
			System.out.println(parte1 + conexaomil + parte2);
		} else {
			System.out.println(parte2);
		}
	}
}