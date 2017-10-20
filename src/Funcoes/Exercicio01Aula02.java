/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

/**
 *1. Crie uma função para pedir um número inteiro ao usuário. Toda vez que você 
 * precisar de um número informado pelo usuário, utilize ela. Ela não tem 
 * parâmetro e o retorno é o valor digitado pelo usuário.
 */
public class Exercicio01Aula02 {

    public static int informaValor(){
        Scanner e = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor=e.nextInt();
        
        return valor;
    }
    
    public static void main(String[] args) {
        
        //informaValor();
        
        System.out.println("O valor informado foi "+informaValor());
    }
    
}
