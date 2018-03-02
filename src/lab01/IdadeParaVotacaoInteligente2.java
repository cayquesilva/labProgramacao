package lab01;

import java.util.Scanner;

/**
 *
 * @author Cayque Rennã Ferreira Silva
 */
public class IdadeParaVotacaoInteligente2 {
 
    public static void main(String[] args) {
        int ano;
        int idade;
        final int ANOATUAL = 2018;
        final int PODEVOTAR = 16;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Para testar se você pode votar, digite o ano do seu nascimento:");
        ano = s.nextInt();
        
        idade = ANOATUAL-ano;
        System.out.println("Você tem ou irá fazer "+idade+" anos.");
        if(idade>=PODEVOTAR && idade<18 && idade>70){
            System.out.println("Você está apto a votar, porém não é obrigatório");
        }else if(idade>=18){
            System.out.println("Você está apto a votar e a votação para a sua idade é obrigatória");
        }else{
            System.out.println("Você não está apto a votar.");
        }
    }
}
