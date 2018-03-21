package lab02;

import java.util.Scanner;

/**
 *
 * @author Cayque Rennã Ferreira Silva
 */
public class PedraPapelTesoura {
    
    public static void main(String[] args) {
        
        final int INDICE = 3; //1 PEDRA / 2 PAPEL / 3 TESOURA
        Scanner scanner = new Scanner(System.in);
        int jogador1, jogador2,resultado,contador=0;
        
        System.out.println("------------------  Digite  -------------------");
        System.out.println("----- 1 - PEDRA ; 2 - PAPEL ; 3 - TESOURA -----");
        
        do{
            if(contador>0){
                System.out.println("\n");
                System.out.println("------------- opção incorreta -----------------");
                System.out.println("------------------  Digite  -------------------");
                System.out.println("----- 1 - PEDRA ; 2 - PAPEL ; 3 - TESOURA -----");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("------------------ Jogador 1 ------------------");
            jogador1=scanner.nextInt();
            contador++;
            }while(jogador1<1 || jogador1>3);
        contador=0;
        do{
            if(contador>0){
                System.out.println("\n");
                System.out.println("------------- opção incorreta -----------------");
                System.out.println("------------------  Digite  -------------------");
                System.out.println("----- 1 - PEDRA ; 2 - PAPEL ; 3 - TESOURA -----");
            }
            System.out.println("-----------------------------------------------");
            System.out.println("------------------ Jogador 2 ------------------");
            jogador2=scanner.nextInt();
            contador++;
            }while(jogador2<1 || jogador2>3);
        
        resultado = Math.abs((INDICE+jogador1-jogador2)%INDICE);
        
        if(resultado>0 && resultado<= INDICE/2){
            System.out.println("O jogador 1 ganhou");
            switch (jogador1) {
                case 1:
                    System.out.println("Escolhendo Pedra");
                    break;
                case 2:
                    System.out.println("Escolhendo Papel");
                    break;
                case 3:
                    System.out.println("Escolhendo Tesoura");
                    break;
                default:
                    break;
            }
           
        }else if(resultado>INDICE/2){
            System.out.println("O jogador 2 ganhou");
            switch (jogador2) {
                case 1:
                    System.out.println("Escolhendo Pedra");
                    break;
                case 2:
                    System.out.println("Escolhendo Papel");
                    break;
                case 3:
                    System.out.println("Escolhendo Tesoura");
                    break;
                default:
                    break;
            }
        }else if(resultado == 0){
            System.out.println("A partida resultou em um empate");
        }
    }
    
    
}
