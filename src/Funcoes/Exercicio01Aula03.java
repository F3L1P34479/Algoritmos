package Funcoes;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio01Aula03 {

    public static void criarMenu() {

        System.out.println("--------Menu--------");
        System.out.println("--------------------");
        System.out.println("------1. Somar------");
        System.out.println("-----2. Subtrair----");
        System.out.println("----3. Multiplicar--");
        System.out.println("-----4. Dividir-----");
        System.out.println("-------0. Sair------");
        System.out.println("--------------------");

    }

    public static void calculadora(double o) {

        
            
        if (o == 1) {
            System.out.println("A soma é "+somar(pedirNum1(), pedirNum2()));
        } 

        else if (o == 2) {
            System.out.println("A subtração é "+subtrair(pedirNum1(), pedirNum2()));
        } 

        else if (o == 3) {
            System.out.println("A multiplicação é "+multiplicar(pedirNum1(), pedirNum2()));
        } 

        else if (o == 4) {
            System.out.println("A divisão é "+dividir(pedirNum1(), pedirNum2()));
        } 

        else if (o == 5) {
            System.out.println("você esta saindo...");
        } 

        else {
            System.out.println("Opção inválida");
        }

        
    }

    public static double pedirNum1() {
        Scanner e = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n = e.nextInt();

        return n;
    }

    public static double pedirNum2() {
        Scanner e = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n = e.nextInt();

        return n;
    }

    public static double somar(double n, double m) {

        double s = n + m;
        
        return s;
    }

    public static double subtrair(double n, double m) {

        double su = n - m;
        
        return su;
    }

    public static double multiplicar(double n, double m) {

        double mu = n * m;
        
        return mu;
    }

    public static double dividir(double n, double m) {

        double d = n / m;
        
        return d;
    }

    public static void main(String[] args) {

        criarMenu();
        
        calculadora(pedirNum1());
        
        

    }

}
