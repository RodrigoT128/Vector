package control;

import javax.swing.JOptionPane;

import model.*;

/**
 * @author Rodrigo Toledo Gomes
 * Classe recebe e organiza as Strings para apresentação
 */
public class Controle {
	/**
	 * @param args recebe Strings e apresenta Resultado apartir da mascara preparada
	 */
	public static void main(String[] args) {
		
		Numeroextenso numero = new Numeroextenso();
		Modelo buscaparte = new Modelo();
		Integer[] digitos = buscaparte.getDigitos(Modelo.Ran());
		
		String parte1 = numero.extenso(buscaparte.getParte1(Modelo.Ran()));
		String parte2 = numero.extenso(buscaparte.getParte2(Modelo.Ran()));
		String conexaomil = " mil ";
		
		if (digitos.length >= 4) {
			JOptionPane.showMessageDialog(null, parte1 + conexaomil + parte2);
		} else {
			JOptionPane.showInputDialog(null, parte2);
		}
	}
}