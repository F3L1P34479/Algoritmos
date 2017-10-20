/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

/**
 *3. Faça uma função que receba um número inteiro e imprima o mês correspondente
 * ao número. Por exemplo, 2 corresponde à “fevereiro”. A função deve mostrar 
 * uma mensagem de erro caso o número recebido não faça sentido.  Dica: 
 * verifique no texto o tipo do retorno e o tipo do parâmetro. Em funções eles 
 * podem ser iguais ou diferentes, não tem problema.
 */
public class Exercicio03Aula02 {
    
    public static int informaValor(){
        Scanner e = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor=e.nextInt();
        
        return valor;
    }
    public static String imprimirMes(){
        int n=informaValor();
        String mes="";
        
        if(n==1){
            mes="Janeiro";
        }
        else if(n==2){
            mes="Fevereiro";
        }
        else if(n==3){
            mes="Março";
        }
        else if(n==4){
            mes="Abril";
        }
        else if(n==5){
            mes="Maio";
        }
        else if(n==6){
            mes="Junho";
        }
        else if(n==7){
            mes="Julho";
        }
        else if(n==8){
            mes="Agosto";
        }
        else if(n==9){
            mes="Setembro";
        }
        else if(n==10){
            mes="Outubro";
        }
        else if(n==11){
            mes="Novembro";
        }
        else if(n==12){
            mes="Dezembro";
        }
        else {
            mes="Valor invalido";
        }
        return mes;
    }
    
    public static void main(String[] args) {
        
        System.out.println("O mes correspondente ao valor é "+imprimirMes());
    }
    
}
