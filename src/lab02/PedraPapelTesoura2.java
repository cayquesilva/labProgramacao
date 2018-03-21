package lab02;

import java.util.Scanner;

/**
 *
 * @author Cayque Rennã Ferreira Silva
 */
public class PedraPapelTesoura2 {
    final static int INDICE = 3; //1 PEDRA / 2 PAPEL / 3 TESOURA
    static Scanner scanner = new Scanner(System.in);
    static int jogador1, jogador2,resultado;
    static String escolha1,escolha2;
    static int contador=0,continuar=0;
    
    public static void main(String[] args) {
        
        do{
            mostrarOpcoes();
            fazerJogada();
            
            
            System.out.println("\nDigite ( -1 ) para sair, ou qualquer numero para jogar.");
            continuar=scanner.nextInt();
        }while(continuar != -1);
    }  

    
    public static void mostrarOpcoes(){
        System.out.println("|---------------------------------------|");
        System.out.println("| ESCOLHA AS OPÇÕES A SEGUIR PARA JOGAR |");
        System.out.println("|           1 =====> PARA PEDRA         |");
        System.out.println("|           2 =====> PARA PAPEL         |");
        System.out.println("|           1 =====> PARA TESOURA       |");
        System.out.println("|---------------------------------------|");
    }
    
    
    public static void fazerJogada(){
        System.out.print("Escolha a opçao do jogador 1: ");
        jogador1=scanner.nextInt();
        escolha1=lerJogada(jogador1);
        System.out.print("Escolha a opçao do jogador 2: ");
        jogador2=scanner.nextInt();
        escolha2=lerJogada(jogador2);
        resultadoJogo(jogador1, jogador2,escolha1,escolha2);
    }
    
    public static String lerJogada(int escolha){
        
        String jogada = null;
        switch(escolha){
            case 1:
                jogada = "PEDRA";
                break;
            case 2:
                jogada = "PAPEL";
                break;
            case 3:
                jogada = "TESOURA";
                break;
    }
        return jogada;
    }
    
    public static void resultadoJogo(int escolha1, int escolha2,String opcao1, String opcao2){
        
        resultado = Math.abs((INDICE+escolha1-escolha2)%INDICE);
        
        if(resultado>0 && resultado<= INDICE/2){
            System.out.println("|---------------------------------------|");
            System.out.println("|         O jogador 1 ganhou            |");
            System.out.println("          "+opcao1+" - "+opcao2+"        ");
            System.out.println("|---------------------------------------|");
           
        }else if(resultado>INDICE/2){
            System.out.println("|---------------------------------------|");
            System.out.println("|         O jogador 2 ganhou            |");
            System.out.println("          "+opcao1+" - "+opcao2+"        ");
            System.out.println("|---------------------------------------|");

        }else if(resultado == 0){
            System.out.println("|---------------------------------------|");
            System.out.println("|    A partida resultou em um empate    |");
            System.out.println("|---------------------------------------|");
        }
        System.out.println(" ");
    }
}

