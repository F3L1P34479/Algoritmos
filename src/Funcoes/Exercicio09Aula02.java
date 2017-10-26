
package Funcoes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *9 Faça uma função que recebe um vetor de números inteiros como parâmetro. Esta 
 * função deve calcular o dobro de todos os valores do vetor e retornar ele 
 * inteiro atualizado. Dica: crie outro vetor dentro da função com o mesmo 
 * tamanho para preencher com o dobro. Você pode utilizar o mesmo laço de 
 * repetição (índices) para pegar o valor de um vetor e preencher outro.
 */
public class Exercicio09Aula02 {

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
    
    public static int[] dobraValor(int []m){
        int []d = new int[m.length];
        
        for(int i=0;i<m.length;i++){
                        
            d[i] =m[i]*2;
            
        }
        
        return d;
    }
            
            
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(dobraValor(informaValor())));
    }
    
}
