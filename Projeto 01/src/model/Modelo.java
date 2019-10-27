package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rodrigo Toledo Gomes
 *
 */
public class Modelo {
	/**
	 * Gera um numero aleatório
	 * @return
	 */
	public static int Ran() {
		int x = (int) (Math.random()*(999999-0));
		System.out.println(x);
		return x;
	}
	
	/**
	 * @param x
	 * @return retorna array completo
	 */
	public Integer[] getDigitos(int x) {
		List<Integer> digitos = new ArrayList<Integer>();
		collectParte(x, digitos);
		return digitos.toArray(new Integer[]{});
	}
	List<Integer> parte = new ArrayList<Integer>();
	/**
	 * @param x recebe numero aleatorio
	 * @return retorna primeiro array com até 3 digitos
	 */
	public Integer[] getParte1(int x) {
		collectParte(x / 1000, parte);
		return parte.toArray(new Integer[]{});
	}
	/**
	 * @param x recebe numero aleatorio
	 * @return retorna segundo array com até 3 digitos
	 */
	public Integer[] getParte2(int x) {
		collectParte(x % 1000, parte);
		return parte.toArray(new Integer[]{});
	}
	/**
	 * Recebe valor int e retorna os valor separado e armazenado em array
	 * @param x recebe numero aleatorio
	 * @param parte
	 */
	private static void collectParte(int x, List<Integer> parte) {
		if(x / 10 > 0) {
			collectParte(x / 10, parte);
		}
		parte.add(x % 10);
	}
}