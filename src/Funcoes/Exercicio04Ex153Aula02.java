/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

/**
 *153. 
Escreva  um  programa  para  ler  uma  temperatura  em  graus  Fahrenheit.  Faça  
uma função chamada celsius para calcular e retornar o valor correspondente em 
graus Celsius. 
Fórmula: C = ((F-32)/9)*5 
 */
public class Exercicio04Ex153Aula02 {

    public static double celsius(double t){
        
        double c = ((t-32)/9)*5;
        
        return c;
    }
    public static void main(String[] args) {
        System.out.println(celsius(332));
    }
    
}
