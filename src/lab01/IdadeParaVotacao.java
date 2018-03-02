package lab01;

/**
 *
 * @author Cayque Rennã Ferreira Silva
 */
public class IdadeParaVotacao {
        
    public static void main(String[] args) {
        int idade = 24;
        final int PODEVOTAR = 16;
        if(idade > PODEVOTAR){
            System.out.println("Você é um eleitor apto a votar, pois tem "+idade+" anos.");
        }else{
            System.out.println("Você ainda não pode votar pois não tem a idade mínima para tal.");
        }  
    }
}
