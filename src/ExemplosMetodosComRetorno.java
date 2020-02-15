
public class ExemplosMetodosComRetorno {
	public static int cubo(int num) {
		return num * num * num;
	}
	
	public static void main(String[] args) {
	
//		int resultado = cubo(3);
//		System.out.println("resultado e : " + resultado);
		
		
//		String resultado = concatenar ("A" , "B");
//		System.out.println(resultado);
		
//		int resultado  = sinal (3);
//		System.out.println(resultado);
		
		boolean resultado = ehDiaSemana ("QUARTA");
		System.out.println(resultado);
		
		boolean posso = possoIrBanco("segunda" ,20);
		System.out.println(posso);
		
	}

	public static String concatenar(String v1, String v2) {
	
		String resultado = v1 + " " + v2; //
		System.out.println(resultado);
		
		return v1 + " " + v2;
	}
	
	
	public static int sinal (int num) {
		if (num >0) {
			return 1;
			
		} else if ( num < 0)  {
			return -1;

		}
		else {
			return 0;
		}
	}
	
	
	public static boolean ehDiaSemana(String dia) {
		if (dia.equalsIgnoreCase("domingo")||dia.equalsIgnoreCase("sabado")  ) {
			return false;
			
		} else {
			return true;

		}
		
	}
	
	
	
	/*
	 * public static boolean possoIrBanco(String dia , double hora) {
	 * if(dia.ehDiaSemana == true || hora >=10 || hora <=16) { return "pode"; else {
	 * return "nao pode"; } } }
	 */

	
	
	
	
	/*
	 * public static boolean possoIrBanco(String dia, double hora) { if
	 * (dia.equalsIgnoreCase("domingo")||dia.equalsIgnoreCase("sabado") ) { return
	 * false;
	 * 
	 * } else if (dia.equalsIgnoreCase("domingo")||dia.equalsIgnoreCase("sabado") ||
	 * hora <=10 || hora >=16){ return false;
	 * 
	 * } else { return true; }
	 * 
	 * }
	 */
	
	
	
	
	public static boolean possoIrBanco(String dia , int hora) {
		boolean diaSemana = ehDiaSemana(dia);
		if (diaSemana == false) {
			return false ;
		}
		else if(hora>=10 && hora<=16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
