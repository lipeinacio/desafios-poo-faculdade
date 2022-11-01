package producao;

public class Producao {
	static int previsaoDemanda = 200; // falta o modificador "static"
	static int producaoNormal = 250; // falta o modificador "static"
	static int estoquelnicial = 50; // falta o modificador "static"
	static int estoqueFinal; // falta o modificador "static"
	public static void main(String[] args){
	 estoqueFinal = (estoquelnicial + producaoNormal - previsaoDemanda); // Parenteses Irregular

	System.out.println( "O estoque final previsto para o mês é de: " + estoqueFinal + " Unidades");

	    }
	}

// DOIS ERROS FORAM ENCONTRADOS
// PRIMEIRO: OS ATRIBUTOS DA CLASSE NÃO ESTAVAM DITOS COM O MODIFICADOR "static"
/* SEGUNDO: HAVIA UM ERRO NA PARTE DA CONTA PARA ENCONTRAR O "estoqueFinal", 
onde o parenteses estava alocado irregularmente */
