package Funcoes;

import java.util.Scanner;

public class FuncaoComRetorno {
    
    //não usamos void porque a função vai ter um retorno
    
    public static double pedirNumero(){
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        double num=e.nextDouble();
        //Depois vamos retornar o valor digitado pelo usuario 
        //para nosso programa
        return num;
    }

    public static void criarMenu() {

        //Colocar o que vai aconteer ao executar
        System.out.println("Criando menu...");
        System.out.println("--------------------");
        System.out.println("1. Somar 2 números");
        System.out.println("2. Calcular número²");
        System.out.println("3. Raiz quadrada");
        System.out.println("4. Calcular dobro");
        System.out.println("5. Calcular tabuada");
        System.out.println("0. Sair");
        System.out.println("--------------------");

        //Nomes de função seguem a mesma regra de nomes de variavel
    }//Finaliza conteúdo da função

    public static void exemploTipo1() {
        int valor = 10;
        valor = valor * 5;

        System.out.println("A variavel valor vale: " + valor);
    }
    
    //Remover o Scanner, o print e o next
    //trocar tudo isso pelo "pedirNumero()"
    //Armazenando em uma variavel nesta função
    public static void calcularDobro() {
        
        double n, dobro;
        
        n = pedirNumero();
        dobro = n * 2;
        System.out.println("Dobro de " + n + " = " + dobro);
    }

    public static void somar2Numeros() {
        
        double n, o, soma;
        
        n = pedirNumero();
        
        o = pedirNumero();
        soma = o + n;
        System.out.println("A soma de " + n + " + " + o + " = " + soma);
    }

    public static void raizQuadrada() {
        
        double n, resultado;
        
        n = pedirNumero();
        resultado = Math.sqrt(n);
        System.out.println("A raiz quadrada de " + n + " = " + resultado);
    }

    public static void calcQuadrado() {
        
        double n, resultado;
        
        n = pedirNumero();
        resultado = Math.pow(n, 2);
        System.out.println("O quadrado de " + n + " = " + resultado);
    }

    public static void calcTab(int x) {
        for (int i = 1; i <= 10; i++) {
            print(x + " * " + i + " = " + (x * i));
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        double opcao = 1;

        System.out.println("Início do programa!");
        criarMenu();
        System.out.print("Digite a opção desejada: ");
        while (opcao != 0) {
            opcao = e.nextInt();
            if (opcao == 1) {
                somar2Numeros();
            } else if (opcao == 2) {
                calcQuadrado();
            } else if (opcao == 3) {
                raizQuadrada();
            } else if (opcao == 5) {
                
                double y = pedirNumero();
                calcTab((int) y);
            } else if (opcao == 4) {
                calcularDobro();
//                System.out.println("Digite outra opção: ");
//                opcao = e.nextInt();
            } else {
                System.out.println("Digite um valor válido!");

            }
            System.out.println("Digite a opção desejada: ");
        }
        if (opcao == 0) {
            System.out.println("Fim.");
        }

    }

}
