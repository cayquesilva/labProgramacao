package lab01;

import java.util.Scanner;

/**
 *
 * @author Cayque Rennã Ferreira Silva
 */
public class IdadeParaVotacaoInteligente {
    
    public static void main(String[] args) {
        int idade;
        final int PODEVOTAR = 16;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Para testar se você pode votar, digite a sua idade:");
        idade = s.nextInt();
        
        if(idade>=PODEVOTAR && idade<18 && idade>70){
            System.out.println("Você está apto a votar, porém não é obrigatório");
        }else if(idade>=18){
            System.out.println("Você está apto a votar e a votação para a sua idade é obrigatória");
        }else{
            System.out.println("Você não está apto a votar.");
        }
    }
}