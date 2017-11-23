/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Exercicio04Ex156Aula02 {

    public static double pedirNLados() {
        Scanner e = new Scanner(System.in);

        System.out.print("Informe o numero de lados: ");
        int num = e.nextInt();

        return num;
    }
    
    public static double pedirMedida() {
        Scanner e = new Scanner(System.in);

        System.out.print("Informe a medida do lado em cm: ");
        int num = e.nextInt();

        return num;
    }
    
    public static void lerValores(double n, double l) {
        
        if(n==3){
            System.out.println("Triangulo com perimetro de "+(3*l)+" cm");
        }
        
        else if(n==4){
            System.out.println("Quadrado com area de "+(l*l)+" cm²");
        }
        
        else if(n==5){
            System.out.println("Pentagono");
        }
        
        
    }

    public static void main(String[] args) {
        lerValores(pedirNLados(),pedirMedida());
        

    }

}
