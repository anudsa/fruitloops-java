package org.generation.loops;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ciclor for(inicialización; terminación; incremento/decremento;)
		//{
			//código
		//}
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
	
		int filas = 5;
		
		for(int i=0; i<filas;i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
					}
				System.out.println("");
		}
		
		
	}
}
