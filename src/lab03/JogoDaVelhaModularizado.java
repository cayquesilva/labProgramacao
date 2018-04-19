package lab03;

import java.util.Scanner;

public class JogoDaVelhaModularizado {
    static char tabuleiro[][] = new char[3][3];
    static final char O='O';
    static final char X='X';
    static int jogada=0,j,i,repetir=0;
    static Scanner sc = new Scanner(System.in);
	
    public static void main(String args[]){
        resetarTabuleiro();
        System.out.print("  JOGO DA VELHA \n");
        while(jogada<=9)
	        {
                mostrarTabuleiro();
                fazerJogada();
                
	    }
	}

    private static void resetarTabuleiro(){
        for(i=0;i<3;i++)
	        for(j=0;j<3;j++)
	            tabuleiro[i][j]=' ';
    }
    
    private static void mostrarTabuleiro(){

        for(i=0;i<3;i++)
            {
                    System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
                if(i<3-1)
                {
                    System.out.print("\n------\n");
                }
            }
    }

    private static void fazerJogada(){
        System.out.println("\nINSIRA AS COORDENADAS");
	        if((jogada%2)==1)System.out.print("PLAYER 2\nLINHA: ");
	        else System.out.print("PLAYER 1\nLINHA: ");

	        i = sc.nextInt();
	        System.out.print("COLUNA: ");
	        j = sc.nextInt();

	        if(tabuleiro[i-1][j-1]==' ')
	        {
	            if((jogada%2)==1)tabuleiro[i-1][j-1]=X;
	            else tabuleiro[i-1][j-1]=O;
	            jogada++;
                    verResultado();
	        }else{
                    System.out.println("Escolha um lugar vazio para jogar!");
                }
    }
    
    private static void verResultado(){
        if((tabuleiro[0][0]==O && tabuleiro[0][1]==O && tabuleiro[0][2]==O)||
        (tabuleiro[1][0]==O && tabuleiro[1][1]==O && tabuleiro[1][2]==O)||
        (tabuleiro[2][0]==O && tabuleiro[2][1]==O && tabuleiro[2][2]==O)||
        (tabuleiro[0][0]==O && tabuleiro[1][0]==O && tabuleiro[2][0]==O)||
        (tabuleiro[0][1]==O && tabuleiro[1][1]==O && tabuleiro[2][1]==O)||
        (tabuleiro[0][2]==O && tabuleiro[1][2]==O && tabuleiro[2][2]==O)||
        (tabuleiro[0][0]==O && tabuleiro[1][1]==O && tabuleiro[2][2]==O)||
        (tabuleiro[0][2]==O && tabuleiro[1][1]==O && tabuleiro[2][0]==O))
        {
            for(i=0;i<3;i++)
            {
                    System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
                if(i<3-1)
                {
                    System.out.print("\n------\n");
                }
            }
            System.out.print("\nJogador 1, VOCE VENCEU!!!");
            jogada=10;
        }else if((tabuleiro[0][0]==X && tabuleiro[0][1]==X && tabuleiro[0][2]==X)||
           (tabuleiro[1][0]==X && tabuleiro[1][1]==X && tabuleiro[1][2]==X)||
           (tabuleiro[2][0]==X && tabuleiro[2][1]==X && tabuleiro[2][2]==X)||
           (tabuleiro[0][0]==X && tabuleiro[1][0]==X && tabuleiro[2][0]==X)||
           (tabuleiro[0][1]==X && tabuleiro[1][1]==X && tabuleiro[2][1]==X)||
           (tabuleiro[0][2]==X && tabuleiro[1][2]==X && tabuleiro[2][2]==X)||
           (tabuleiro[0][0]==X && tabuleiro[1][1]==X && tabuleiro[2][2]==X)||
           (tabuleiro[0][2]==X && tabuleiro[1][1]==X && tabuleiro[2][0]==X))
        {
            for(i=0;i<3;i++)
            {
                    System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
                if(i<3-1)
                {
                    System.out.print("\n------\n");
                }
            }
            System.out.print("\nJogador 2, VOCE VENCEU!!!");
            jogada=10;
        }else if(jogada==9)
            {
                for(i=0;i<3;i++)
                {
                System.out.print(tabuleiro[i][0]+"|"+tabuleiro[i][1]+"|"+tabuleiro[i][2]);
                if(i<3-1)
                {
                    System.out.print("\n------\n");
                }
            }
            System.out.print("\nPARTIDA EMPATADA\n");
            System.out.println("Deseja repetir a partida?");
            System.out.println("0 ---------- SIM!");
            System.out.println("1 ---------- NÃO!");

            repetir=sc.nextInt();
            if(repetir==0){
                resetarTabuleiro();
                jogada=0;
            }else{
                jogada=9;
            }
        }
    }
}