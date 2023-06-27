package org.generation.loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// Ejecuta de manera continua un bloque de código, cuando no se cumple, se termina.
		int contador=1;
		while(contador<=10) {
			System.out.println(contador);
			contador+=1;
		}

		//Que cuente hasta el valor indicado.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserte el número: ");
		int numeroFinal=scanner.nextInt(),counter=1;
		while(counter<=numeroFinal) {
			System.out.println(counter);
			counter+=1;
		}
		System.out.println("Finalizado");
		scanner.close();
	}
}
