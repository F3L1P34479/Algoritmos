package Funcoes;

import java.util.Scanner;

/**
 *5. Desafio: Faça um programa para calcular o Fatorial de um número. Para o 
 * cálculo do fatorial, sabemos que n! depende de (n-1)!; este por sua vez 
 * depende de (n-2)!; e, assim por diante, até que n seja 1, quando então 
 * tem-se que fatorial de 1 é igual a 1 mesmo. Utilize uma função que recebe 
 * como parâmetro de entrada o número a ser calculado o fatorial, do tipo 
 * inteiro, e retorna o fatorial deste número, também do tipo inteiro. 
 * (Não utilize laço de repetição)
 */
public class Exercicio05Aula02 {

    public static int informaValor(){
        Scanner e = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor=e.nextInt();
        
        return valor;
    }
    
    public static int calcularFatorial(int n){
                
        int i=n;
 
        if(i!=1){
            
             i = n*calcularFatorial(n-1);
   
        }
        
        else{
            
            i=n;
            
        }               
        
        return i;
    }
    
    public static void main(String[] args) {
        
        System.out.println("O fatorial é "+calcularFatorial(informaValor()));
    }
    
}
