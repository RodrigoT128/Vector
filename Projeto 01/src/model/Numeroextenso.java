package model;

import model.Modelo;

/**
 * @author Rodrigo Toledo Gomes
 * Classe recebe array de numeros e retorna Strings prontas para 
 */
public class Numeroextenso extends Modelo {
	
	/**
	 * @param getList recebe array de até 3 numeros
	 * @return retorna String correta baseada no numero recebido pelo array
	 */
	public String extenso(Integer[] getList) {
		
		String extenso = "", conexaoE, cem;
		String[] unidade, dezena, dezenadez, centena;

		unidade	= new String[10];
		dezena = new String[10];
		dezenadez = new String[10];
		centena = new String[10];

		unidade[0] = "zero";
		unidade[1] = "um";
		unidade[2] = "dois";
		unidade[3] = "três";
		unidade[4] = "quatro";
		unidade[5] = "cinco";
		unidade[6] = "seis";
		unidade[7] = "sete";
		unidade[8] = "oito";
		unidade[9] = "nove";
		
		dezenadez[0] = "dez";
		dezenadez[1] = "onze";
		dezenadez[2] = "doze";
		dezenadez[3] = "treze";
		dezenadez[4] = "quatorze";
		dezenadez[5] = "quinze";
		dezenadez[6] = "dezesseis";
		dezenadez[7] = "dezessete";
		dezenadez[8] = "dezoito";
		dezenadez[9] = "dezenove";

		dezena[0] = "";
		dezena[1] = "dez";
		dezena[2] = "vinte";
		dezena[3] = "trinta";
		dezena[4] = "quarenta";
		dezena[5] = "cinquenta";
		dezena[6] = "sessenta";
		dezena[7] = "setenta";
		dezena[8] = "oitenta";
		dezena[9] = "noventa";

		centena[0] = "";
		centena[1] = "cento";
		centena[2] = "duzentos";
		centena[3] = "trezentos";
		centena[4] = "quatrocentos";
		centena[5] = "quinhentos";
		centena[6] = "sencentos";
		centena[7] = "setecentos";
		centena[8] = "oitocentos";
		centena[9] = "novecentos";

		cem = "cem";
		conexaoE = " e ";

		Integer[] parte = getList;

		switch (parte.length) {
		case 1:
				extenso = unidade[ parte[0] ];										// unidade
		case 2:
			if (parte[0] == 1){ 													// dezena de 10 a 19 
				extenso = dezenadez[ parte[0] ];
			}
			else if (parte[0] >= 2 && parte[1] == 0) { 								// dezena com numero 0
				extenso = dezena[ parte[0] ];
			}
			else if (parte[0] >= 2 && parte[0] <= 9) { 								// dezena sem numero 0
				extenso = dezena[ parte[0] ] + conexaoE + unidade[ parte[1] ];
			}
		case 3:
			if (parte[0] == 1 && parte[1] == 0 && parte[2] == 0) {					// centena 100
				extenso = cem;
			}
			else if (parte[0] >= 1 && parte[1] == 0) { 								// centena com numero central 0
				extenso = centena[ parte[0] ] + conexaoE + unidade[ parte[2] ];
			}
			else if (parte[0] >= 1 && parte[1] != 0 && parte[2] == 0) {				// centena com ultimo numero 0
				extenso = centena[ parte[0] ] + conexaoE + dezena[ parte[1] ];
			}
			else if (parte[0] >= 1 && parte[1] == 1) { 								// centena com dezena de 10 a 19
				extenso = centena[ parte[0] ] + conexaoE + dezenadez[ parte[2] ]; 
			}
			else if (parte[0] >= 1 && parte[1] != 0 && parte[2] != 0) { 			// centena sem numero 0
				extenso = centena[ parte[0] ] + conexaoE + dezena[ parte[1] ] + conexaoE + unidade[ parte[2] ];
			}
			else if (parte[0] == 0 && parte[1] != 0 && parte[2] != 0) {				// centena com primeiro numero 0
				extenso = dezena[ parte[0] ] + conexaoE + unidade[ parte[1] ];
			}
		}
		return (extenso);
	}
}