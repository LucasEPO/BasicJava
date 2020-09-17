/**
 * Código exercício 3 CA1 POO
 * Autor: Lucas Eduardo Pereira de Oliveira
 * 
 */

package pooca1;

import java.util.Scanner;

public class PooCA1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int xCentro, yCentro , raio;    //Variáveis do círculo
        int xPonto, yPonto;             //Variáveis do ponto
        double area, peri, localPonto;  //Variáveis para saída
        
        //Recebendo as variáveis do circulo
        System.out.println("Insira os dados referentes ao circulo (x, y, Raio)");
        xCentro = scan.nextInt();
        yCentro = scan.nextInt();
        raio = scan.nextInt();
        
        //Recebendo as variáveis do ponto
        System.out.println("Agora insira o ponto (x, y)");
        xPonto = scan.nextInt();
        yPonto = scan.nextInt();
       
        //Cálculos requisitados no problema
        area = Math.pow(raio, 2) * Math.PI;
        peri = 2 * Math.PI * raio;
        localPonto = Math.pow((xPonto - xCentro), 2)+Math.pow((yPonto - yCentro), 2);
        
        //Saídas
        System.out.printf("A área do círculo = %.2f; \n", area);
        System.out.printf("O perimetro do círculo = %.2f; \n", peri);
        
        //Estrutura para definição da ultima saida
        if(localPonto < Math.pow(raio, 2)){
            System.out.println("Como "+localPonto+" < " +Math.pow(raio, 2) );
            System.out.println("O ponto é Interno ao círculo!");          
        }else if(localPonto == Math.pow(raio, 2)){
            System.out.println("Como "+localPonto+" = " +Math.pow(raio, 2) );
            System.out.println("O ponto Pertence ao círculo!");
        }else {
            System.out.println("Como "+localPonto+" > " +Math.pow(raio, 2) );
            System.out.println("O ponto é Externo ao círculo!");            
        }
        
    }
    
}
