
public class ExemplosMetodosVoid {
	public static void main(String[] args) {
		saudacao(10);  /* nome do metado criado  */
		dobro(3);  /* nome do metado criado*/
		metade(10); /* nome do metado criado */
		soma(5);
		contarCaracter("anderson"); /* nome do metado criado string tem 	que estar entre "" */
		somar(3,2);
	}

	public static void saudacao(int periodo) {
	/*	System.out.println("ola mundo estou rico");*/
		
		if (periodo == 1) {
			System.out.println("bom dia");
			
		} else if(periodo == 2) {
			System.out.println("boa tarde");
		}
		else if (periodo == 3) {
			System.out.println("boa noite");
		}
		else {
			System.out.println("ola");
		}
	}
	
	public static void dobro (int valor) {
		int resultado = valor * 2;
		System.out.println("resultado da multiplicação é :"+ resultado );
	}
	
	public static void metade(double resultadoMetade) {
		double resultado1 = resultadoMetade / 2 ;
		System.out.println("resultado da divisao é :"+ resultado1);
		
	}
	
	public static void soma (int somar) {
		int resultado = somar + somar;
		System.out.println("o resultado da soma é :" + resultado);
		
	}
	
	public static void contarCaracter(String a) {
//		String nome = a; nao é necessario  basta colocar o a declarado no metodo dentro do syso dessa forma   a.length()
		System.out.println("A String que você criou tem " + a.length() + " letras");
		
	}
	
	
	public static void somar(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("a soma dos dois numero e :"+ resultado);
	}
	
}
