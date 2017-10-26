
package Funcoes;

import java.util.Scanner;

/**
 *6-Faça uma função que receba um vetor como parâmetro e retorne apenas o maior 
 * valor deste vetor.
 */
public class Exercicio06Aula02 {
    
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
    
    public static int encontraMaior(int []m){
        
        for(int i=0;i<m.length;i++){
            int a = m[i];
            for(int j=i-1;j>=0&&m[j]>a;j--){
                m[j+1]=m[j];
                m[j]=a;
                
            }
        }
        
        int maior=m[m.length-1];
        
        return maior;
    }
            
            
    public static void main(String[] args) {
        
        System.out.println(encontraMaior(informaValor()));
    }
    
}
