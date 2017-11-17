package Matrizes;

public class Introducao {

    
    public static void main(String[] args) {
        // Criar um vetor com cinco colunas
        int [] vetor = new int[5];
        
        //preenchendo um vetor
        for(int i = 0;i<vetor.length;i++){
            //armazenando
            vetor[i]=i*4;
        }
        
        //Criando uma matriz de duas dimensões 3x4 (linha coluna)
        int [][] matriz = new int [3][4];
        
        //percorrendo as linhas da matriz
        for(int l = 0;l<3;l++){
            //percorrendo as colunas da matriz
            for(int c = 0;c<4;c++){
                //armazenando
                matriz[l][c]=l*c;
            }
            
        }
        
        for(int l = 0;l<3;l++){
            //percorrendo as colunas da matriz
            for(int c = 0;c<4;c++){
                //armazenando
                System.out.print("|"+matriz[l][c]+"|");
            }
            System.out.println("");
        }
    }
    
}
