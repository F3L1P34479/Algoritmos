package Funcoes;

import java.util.Scanner;

/**
 *8 Faça uma função para receber um vetor como parâmetro, calcular a soma desse 
 * vetor e retornar apenas a média dos valores.
 */
public class Exercicio08Aula02 {

    public static int[] informaValor(){
        Scanner e = new Scanner(System.in);
        int valor=0;
        System.out.print("Informe p tamanho do vetor: ");
        valor=e.nextInt();
        
        int []v = new int[valor];
        
        for(int i=0;i<v.length;i++){
            System.out.print("Informe um numero: ");
            v[i]=e.nextInt();
        }
              
        return v;
    }
    
    public static int encontraMedia(int []m){
        int s=0;
        for(int i=0;i<m.length;i++){
            
            
            s = s+m[i];
            
        }
        
        
        int media=s/m.length;
        
        return media;
    }
            
            
    public static void main(String[] args) {
        
        System.out.println(encontraMedia(informaValor()));
    }
    
}
