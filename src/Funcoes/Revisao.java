/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

/**
 *
 * @author aluno
 */
public class Revisao {

    public static int contarInteiros(int [] elementos){
        int cont=0;
        for(int i=0;i<elementos.length;i++){
            if(elementos[i]<0){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        
        int []vt = {10,-50,5,-3};
        
        System.out.println(contarInteiros(vt));
        
    }
    
}
