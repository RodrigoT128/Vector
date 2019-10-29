package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rodrigo Toledo Gomes
 * Classe cria e prepara arrays para serem lidos
 */
public class Modelo {
	/**
	 * Gera um numero aleatório
	 * @return retorna o numero transformado em int
	 */
	public static int Ran() {
		int y = (int) (Math.random()*(999999-0));
		return y;
	}
	/**
	 * @param x recebe numero aleatorio
	 * @return retorna array completo
	 */
	public Integer[] getDigitos(int x) {
		List<Integer> digitos = new ArrayList<Integer>();
		collectParte(x, digitos);
		return digitos.toArray(new Integer[]{});
	}
	/**
	 * @param x recebe numero aleatorio
	 * @return retorna o primeiro array com até 3 digitos
	 */
	public Integer[] getParte1(int x) {
		List<Integer> parte = new ArrayList<Integer>();
		collectParte(x / 1000, parte);
		return parte.toArray(new Integer[]{});
	}
	/**
	 * @param x recebe numero aleatorio
	 * @return retorna o segundo array com até 3 digitos
	 */
	public Integer[] getParte2(int x) {
		List<Integer> parte2 = new ArrayList<Integer>();
		collectParte2(x % 1000, parte2);
		return parte2.toArray(new Integer[]{});
	}
	/**
	 * Recebe valor int e retorna os valor separado e armazenado em array
	 * @param x recebe numero aleatorio
	 * @param parte quarda  
	 */
	private static void collectParte(int x, List<Integer> parte) {
		if(x / 10 > 0) {
			collectParte(x / 10, parte);
		}
		parte.add(x % 10);
	}
	private static void collectParte2(int x, List<Integer> parte2) {
		if(x / 10 > 0) {
			collectParte2(x / 10, parte2);
		}
		parte2.add(x % 10);
	}
}