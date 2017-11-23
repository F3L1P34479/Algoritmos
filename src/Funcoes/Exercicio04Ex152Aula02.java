/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

/**
 *152. Escreva um programa que leia o raio de um círculo e faça duas funções: 
 * uma função chamada area que calcula e retorna a área do círculo e outra 
 * função chamada perimetro que calcula e retorna o perímetro do círculo. 
 * Área = PI * r2; Perímetro = PI * 2 * r; 
 */
public class Exercicio04Ex152Aula02 {

    public static double pedirVRaio(){
        Scanner e = new Scanner(System.in);
        
        System.out.print("Informe o valor do raio do circulo: ");
        int num=e.nextInt();
        
        return num;
    }
    
    public static double cauculaArea(double v){
        double a=3.14*(v*v);
        
        return a;
    }
    
    public static double cauculaPerimetro(double v){
        double p=3.14*2*v;
        
        return p;
    }
    
    public static void main(String[] args) {
        System.out.println("A area do circulo é "+cauculaArea(pedirVRaio()));
        System.out.println("O perimetro do circulo é "+cauculaPerimetro(pedirVRaio()));
        
    }
    
}
