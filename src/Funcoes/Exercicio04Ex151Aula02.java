
package Funcoes;

import java.util.Scanner;

/**
 *151. Faça uma função que recebe um número inteiro por parâmetro e retorna
 *  verdadeiro se ele for par e falso se for ímpar.
 */
public class Exercicio04Ex151Aula02 {
    
    public static int pedirNum(){
        Scanner e = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int n=e.nextInt();
        
        return n;
    }

    public static boolean verificaImpar(int n){
        
        
        boolean r;
        if(n%2==0){
            r=true;
        }
        else{
            r=false;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(verificaImpar(pedirNum()));
    }
    
}
