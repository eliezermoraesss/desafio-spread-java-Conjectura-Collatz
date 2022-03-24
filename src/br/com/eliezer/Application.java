package br.com.eliezer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Long> list = new ArrayList<>();	
		int contador = 0;
		
		System.out.print("Digite um valor desejado: ");
		long valorDigitado = sc.nextLong();
		System.out.println();

		do {
			
			if (contador < 10) {
				list.add(valorDigitado);
				contador++;
			}
			
			// PAR
			if (valorDigitado % 2 == 0) {

				valorDigitado = valorDigitado / 2;

				// ÍMPAR
			}
			
			if (valorDigitado % 2 != 0) {

				 valorDigitado = (valorDigitado * 3) + 1;

			}

		} while (valorDigitado >= 4);
		
		System.out.println("Exibição dos 10 primeiros valores da lista: " + list + "\n");
		
		
		//MÉDIA DOS 10 PRIMEIROS VALORES
		long media = 0L;
		long soma = 0L;
		for (int i = 0; i < 10; i++) {			
			soma += list.get(i);   
	        media = soma / 10;
	        
	      }		
		System.out.println(" A média dos 10 primeiros valores da lista é: " + media + "\n");
		
		//OBTENDO O MAIOR VALOR DA LISTA
		long max = 0L;
		for (int i = 0; i < 10; i++) {
			
	         if (list.get(i) > max) 
	        	 max = list.get(i);
	         
	      }
		System.out.println(" O maior valor da lista é: " + max + "\n");
		
		sc.close();
	}
}
