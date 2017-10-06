package algoritmos;

import java.util.Scanner;


public class Algoritmos {

    public static double quadrado(double n){
        double r=n*n;
        return r;
        
    }
    
    public static double metade(double n){
        
        double r=n/2;
        return r;
    }
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        //calculando raiz quadrada
        double raiz;
        raiz=Math.sqrt(15);
        
        System.out.println("A raiz é "+raiz);
        
        System.out.print("Informe um numero:");
        double n=e.nextDouble();
        
        System.out.println("O quadrado do valor informado é "+quadrado(n));
        System.out.println("A metade do valor informado é "+metade(n));
    }
    
}
