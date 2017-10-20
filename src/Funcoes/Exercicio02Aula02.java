/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Random;
import java.util.Scanner;

/**
 *2. Faça uma função para gerar números aleatórios. Esta função deve receber um 
 * número inteiro como limite de valor e retornar um número entre 1 e esse 
 * limite. Assim, toda vez que você precisar de um número qualquer pode usar a 
 * função do exercício anterior ou a deste.
 */
public class Exercicio02Aula02 {
    
    public static int informaValor(){
        Scanner e = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor=e.nextInt();
        
        return valor;
    }
    
    public static int geradorAleatorio(){
        Random r = new Random();
        int n = informaValor();
        int a = r.nextInt(n);
               
        return a;
    }
    
    public static void main(String[] args) {
        
        
        
        System.out.println("O número gerado aleatoriamente foi "+geradorAleatorio());
        
    }
    
}
