/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cayque
 */
public class RealizarJogada {
    
    private static int contador;
    private static int mododejogo;
    private static int teste;
    private static int continuar;
    private static int resultado;
    private static int escolha1,escolha2;
    private static int INDICE=3;
    private static Random random= new Random();
    
    private static Jogador jogador;
    private static Jogador jogador2;
    private static Scanner scanner = new Scanner(System.in);
    
    
    
    private static void mostrarOpcoes(){
        System.out.println("|---------------------------------------|");
        System.out.println("| ESCOLHA AS OPÇÕES A SEGUIR PARA JOGAR |");
        System.out.println("|           1 =====> PARA PEDRA         |");
        System.out.println("|           2 =====> PARA PAPEL         |");
        System.out.println("|           3 =====> PARA TESOURA       |");
        System.out.println("|---------------------------------------|");
    }
    
    
    public static void iniciarJogo(){
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
    
    
    private static int resultadoJogo(int escolha1, int escolha2, String opcao1, String opcao2,int modo){
        
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
                jogador=new Jogador(scanner.nextInt());
                contador++;
            }while(jogador.getJogada()<1 || jogador.getJogada() >3);
            escolha1=jogador.getJogada();
            contador=0;
            System.out.print("Escolha a opçao do jogador 2: ");
            do{
                if(contador>0){
                    System.out.println("Opção de jogador inválida");
                    mostrarOpcoes();
                }
                jogador2=new Jogador(scanner.nextInt());
                contador++;
            }while(jogador2.getJogada()<1 || jogador2.getJogada() >3);
            escolha2=jogador2.getJogada();
            contador=0;
            empate=resultadoJogo(escolha1,escolha2,jogador.getTipojogada().getNome(),jogador2.getTipojogada().getNome(),modo);
        }else{
            System.out.print("Escolha a opçao do jogador 1: ");
            do{
                if(contador>0){
                    System.out.println("Opção de jogador inválida");
                    mostrarOpcoes();
                }
                jogador=new Jogador(scanner.nextInt());
                contador++;
            }while(jogador.getJogada()<1 || jogador.getJogada() >3);
            escolha1=jogador.getJogada();
            contador=0;
            jogador2=new Jogador(random.nextInt(3)+1);
            escolha2=jogador2.getJogada();
            empate=resultadoJogo(escolha1,escolha2,jogador.getTipojogada().getNome(),jogador2.getTipojogada().getNome(),modo);
        }
        return empate;
    }
}
