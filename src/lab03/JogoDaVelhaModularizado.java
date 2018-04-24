package lab03;

import java.util.Scanner;

public class JogoDaVelhaModularizado {
    static char tabuleiro[][] = new char[3][3];
    static final char O='O';
    static final char X='X';
    static int jogada=0,j,i,repetir=0,auxiliarjogador1,auxiliarjogador2;
    static String jogador1,jogador2;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        
        System.out.println("----- Cadastre 4 pessoas para jogar -----");
        do{
            AuxiliaCampeonato.setPessoa(new JogoDaVelhaCampeonato());
        }
        while(AuxiliaCampeonato.getContador()<4);
        
        selecionaJogador();
        resetarTabuleiro();
        System.out.println("\n----- JOGO DA VELHA -----\n");
        while(jogada<=9)
	        {
                mostrarTabuleiro();
                fazerJogada();
	    }
        System.out.println("----- Ranking de Jogadores -----");
        for(i=0;i<AuxiliaCampeonato.getContador();i++){
            System.out.println("----- "+AuxiliaCampeonato.getPessoa()[i].getNome()+" [ Vitórias: "+
                    AuxiliaCampeonato.getPessoa()[i].getVitorias()+" ] [ Derrotas: "+
                    AuxiliaCampeonato.getPessoa()[i].getDerrotas()+" ] [ Empates: "+
                    AuxiliaCampeonato.getPessoa()[i].getEmpates()+" ]\n--------------------"
                            + "------------------------------------"); 
        }
    }
    
    private static void selecionaJogador(){
        System.out.println("----- Selecione o primeiro jogador -----");
        AuxiliaCampeonato.getPessoaSelecao();
        auxiliarjogador1=sc.nextInt();
        jogador1=AuxiliaCampeonato.getPessoa()[auxiliarjogador1].getNome();
        System.out.println("----- Selecione o segundo jogador -----");
        AuxiliaCampeonato.getPessoaSelecao();
        auxiliarjogador2=sc.nextInt();
        while(auxiliarjogador1==auxiliarjogador2){
            System.out.println("----- Selecione outra opção para o segundo jogador -----");
            AuxiliaCampeonato.getPessoaSelecao();
            auxiliarjogador2=sc.nextInt();
        }
        jogador2=AuxiliaCampeonato.getPessoa()[auxiliarjogador2].getNome();
    }
    
    private static void resetarTabuleiro(){
        for(i=0;i<3;i++)
	        for(j=0;j<3;j++)
	            tabuleiro[i][j]=' ';
    }
    
    private static int continuarJogando(){
        System.out.println("\nDigite [ 1 ] para continuar jogando");
        System.out.println("Digite [ 0 ] para sair.");
        int teste = sc.nextInt();
        if(teste==1){
            selecionaJogador();
            resetarTabuleiro();
            return 0;
        }else{
            return 10;
        }
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
        System.out.println("\n");
    }

    private static void fazerJogada(){
        System.out.println("----- Insira as Coordenadas -----");
	        if((jogada%2)==1)System.out.println("-----"+jogador2+" -----\nEscolha a Linha: ");
	        else System.out.print("-----"+jogador1+" -----\nEscolha a Linha: ");

	        i = sc.nextInt();
	        System.out.print("Escolha a Coluna: ");
	        j = sc.nextInt();

	        if(tabuleiro[i-1][j-1]==' ')
	        {
	            if((jogada%2)==1)tabuleiro[i-1][j-1]=X;
	            else tabuleiro[i-1][j-1]=O;
	            jogada++;
                    verResultado();
	        }else{
                    System.out.println("----- Escolha um lugar vazio para jogar -----");
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
            System.out.print(jogador1+"\n, VOCE VENCEU!!!");
            AuxiliaCampeonato.getPessoa()[auxiliarjogador1].setVitorias();
            AuxiliaCampeonato.getPessoa()[auxiliarjogador2].setDerrotas();
            jogada=continuarJogando();
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
            System.out.print(jogador2+"\n, VOCE VENCEU!!!");
            AuxiliaCampeonato.getPessoa()[auxiliarjogador2].setVitorias();
            AuxiliaCampeonato.getPessoa()[auxiliarjogador1].setDerrotas();
            jogada=continuarJogando();
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
            AuxiliaCampeonato.getPessoa()[auxiliarjogador1].setEmpates();
            AuxiliaCampeonato.getPessoa()[auxiliarjogador2].setEmpates();
            jogada=continuarJogando();
        }
    }
}