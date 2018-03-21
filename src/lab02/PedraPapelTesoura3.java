package lab02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cayque Rennã Ferreira Silva
 */
public class PedraPapelTesoura3 {
    final static int INDICE = 3; //1 PEDRA / 2 PAPEL / 3 TESOURA
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int jogador1, jogador2,resultado;
    static String escolha1,escolha2;
    static int contador=0,continuar=0,mododejogo,teste;
    
    public static void main(String[] args) {
        iniciarJogo();
    }

    
    private static void mostrarOpcoes(){
        System.out.println("|---------------------------------------|");
        System.out.println("| ESCOLHA AS OPÇÕES A SEGUIR PARA JOGAR |");
        System.out.println("|           1 =====> PARA PEDRA         |");
        System.out.println("|           2 =====> PARA PAPEL         |");
        System.out.println("|           3 =====> PARA TESOURA       |");
        System.out.println("|---------------------------------------|");
    }
    
    private static void iniciarJogo(){
        do{
            System.out.println("|---------------------------------------|");
            System.out.println("|         ESCOLHA O MODO DE JOGO        |");
            System.out.println("|        1 =====> CONTRA O COMPUTADOR   |");
            System.out.println("|        2 =====> CONTRA OUTRO PLAYER   |");
            System.out.println("|---------------------------------------|");
            do{
                if(contador>0){
                    System.out.println("|         MODO DE JOGO INVÁLIDO         |");
                    System.out.println("|---------------------------------------|");
                    System.out.println("|         ESCOLHA O MODO DE JOGO        |");
                    System.out.println("|        1 =====> CONTRA O COMPUTADOR   |");
                    System.out.println("|        2 =====> CONTRA OUTRO PLAYER   |");
                    System.out.println("|---------------------------------------|");
                }
            mododejogo=scanner.nextInt();
            contador++;
            }while(mododejogo<1 || mododejogo>2);
            contador=0;
        do{
            mostrarOpcoes();
            teste=fazerJogada(mododejogo);
        }while(teste==0);
            
        System.out.println("\nDigite ( -1 ) para sair, ou qualquer numero para jogar.");
        continuar=scanner.nextInt();
        }while(continuar != -1);
    }
    
    private static int fazerJogada(int modo){
        int empate;
        contador=0;
        if(modo!=1){
            System.out.print("Escolha a opçao do jogador 1: ");
            do{
                if(contador>0){
                    System.out.println("Opção de jogador inválida");
                    mostrarOpcoes();
                }
                jogador1=scanner.nextInt();
                contador++;
            }while(jogador1<1 || jogador1 >3);
            escolha1=lerJogada(jogador1);
            contador=0;
            System.out.print("Escolha a opçao do jogador 2: ");
            do{
                if(contador>0){
                    System.out.println("Opção de jogador inválida");
                    mostrarOpcoes();
                }
                jogador2=scanner.nextInt();
                contador++;
            }while(jogador2<1 || jogador2 >3);
            escolha2=lerJogada(jogador2);
            contador=0;
            empate=resultadoJogo(jogador1, jogador2,escolha1,escolha2,modo);
        }else{
            System.out.print("Escolha a opçao do jogador 1: ");
            do{
                if(contador>0){
                    System.out.println("Opção de jogador inválida");
                    mostrarOpcoes();
                }
                jogador1=scanner.nextInt();
                contador++;
            }while(jogador1<1 || jogador1 >3);
            escolha1=lerJogada(jogador1);
            contador=0;
            jogador2=random.nextInt(3)+1;
            escolha2=lerJogada(jogador2);
            empate=resultadoJogo(jogador1, jogador2,escolha1,escolha2,modo);
        }
        return empate;
    }
    
    private static String lerJogada(int escolha){
        
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
    
    private static int resultadoJogo(int escolha1, int escolha2,String opcao1, String opcao2,int modo){
        
        int controlador=1;
        resultado = Math.abs((INDICE+escolha1-escolha2)%INDICE);
        switch(modo){
            case 1:
                if(resultado>0 && resultado<= INDICE/2){
                System.out.println("|----------------------------------------|");
                System.out.println("|         O jogador 1 ganhou            |");
                System.out.println("|Jogador1 "+opcao1+" || Computador "+opcao2+"   |");
                System.out.println("|----------------------------------------|");

                    }else if(resultado>INDICE/2){
                        System.out.println("|----------------------------------------|");
                        System.out.println("|          O computador ganhou           |");
                        System.out.println("|Jogador1 "+opcao1+" || Computador "+opcao2+"   |");
                        System.out.println("|----------------------------------------|");

                        }else if(resultado == 0){
                            System.out.println("|----------------------------------------|");
                            System.out.println("|    A partida resultou em um empate     |");
                            System.out.println("|----------------------------------------|");
                            controlador=0;
                        }
            System.out.println(" ");
            break;
            
            case 2:

                if(resultado>0 && resultado<= INDICE/2){
                    System.out.println("|----------------------------------------|");
                    System.out.println("|          O jogador 1 ganhou            |");
                    System.out.println("|Jogador1 "+opcao1+" || Jogador2 "+opcao2+" |");
                    System.out.println("|----------------------------------------|");

                    }else if(resultado>INDICE/2){
                        System.out.println("|----------------------------------------|");
                        System.out.println("|          O jogador 2 ganhou            |");
                        System.out.println("|Jogador1 "+opcao1+" || Jogador2 "+opcao2+" |");
                        System.out.println("|----------------------------------------|");

                        }else if(resultado == 0){
                            System.out.println("|----------------------------------------|");
                            System.out.println("|    A partida resultou em um empate     |");
                            System.out.println("|----------------------------------------|");
                            controlador=0;
                        }
                System.out.println(" ");
                break;
        }
        return controlador;
    }
}

