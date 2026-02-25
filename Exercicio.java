package Aula03Variaveis;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
    	
        double valorLitro, distanciaTotal, consumoMedio, litrosGastos, custoTotal;
       
        
        Scanner ler = new Scanner(System.in);
   
        
        System.out.println("Coloque o valor do litro da gasolina: ");
        valorLitro= ler.nextDouble();
         
        System.out.println("Coloque a distância total percorrida: ");
        distanciaTotal= ler.nextDouble();
       
        System.out.println("Coloque consumo médio do carro: ");
        consumoMedio= ler.nextDouble();
       
        
        litrosGastos = distanciaTotal / consumoMedio;
       
        custoTotal = litrosGastos * valorLitro;
       
        
        System.out.println("A quantidade de litros gastos:" + litrosGastos);
        ler.close();
       
        System.out.println("O custo total foi:" + custoTotal);
        ler.close(); 
    }
}