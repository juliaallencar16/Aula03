package Aula03Variaveis;

import java.util.Scanner;

public class Conversoraula4 {

	public static void main(String[] args) {

	        double fahrenheit, celsius;

	        Scanner ler = new Scanner(System.in);

	        System.out.println("Digite a temperatura em graus Fahrenheit:");
	        fahrenheit = ler.nextDouble();

	        celsius = ((fahrenheit - 32) * 5) / 9;

	        System.out.println();("Temperatura em Celsius: " + celsius);

	        ler.close();
	        
	    }
	}

	
		
		
		

	


