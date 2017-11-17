/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrizes;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        
        System.out.println("Número: "+r.nextInt(20));
        
        int[][] m = new int[5][10];
        
        for(int l = 0;l<5;l++){
            for(int c=0;c<10;c++){
                m[l][c] = r.nextInt(101);
                System.out.print("|"+m[l][c]+"|");
            }
            System.out.println("");
        }
        
        int maior = 0;
        
        for(int l = 0;l<5;l++){
            for(int c=0;c<10;c++){
                if(m[l][c]>maior){
                    maior=m[l][c];
                }
            }
        }
        System.out.println("O maior valor dentro da matriz é: "+maior);
        
        
        int menor=100;
        for(int l = 0;l<5;l++){
            for(int c=0;c<10;c++){
                if(m[l][c]<menor){
                    menor=m[l][c];
                }
            }
        }
        System.out.println("O menor valor dentro da matriz é: "+menor);
        
        int lmaior=0;
        int cmaior=0;
        for(int l = 0;l<5;l++){
            for(int c=0;c<10;c++){
                
                if(m[l][c]>maior){
                    maior=m[l][c];
                    lmaior=l;
                    cmaior=c;
                }
                
            }
        }
        System.out.println("O maior valor dentro da matriz é: "+maior+" na posição "+lmaior+" "+cmaior);
        
        int soma=0;
        
        for(int l = 0;l<5;l++){
            for(int c=0;c<10;c++){
                
                soma=soma+m[l][c];
                               
            }
        }
        System.out.println("A media dos valores da matriz é "+soma/50);
        
    }
    
}
