
package lab03;

import java.util.Scanner;

public class AuxiliaCampeonato {
    private static JogoDaVelhaCampeonato pessoa[] = new JogoDaVelhaCampeonato[4];
    private static int contador=0;
    private static Scanner s = new Scanner(System.in);
    
    public static JogoDaVelhaCampeonato[] getPessoa() {
        return pessoa;
    }

    public static void getPessoaSelecao(){
        if(AuxiliaCampeonato.contador>0){
            for (int j = 0;j<AuxiliaCampeonato.contador;j++){
                System.out.println("Digite "+j+" para "+AuxiliaCampeonato.pessoa[j].getNome());
            }
        }else{
            System.out.println("Não existem jogadores para serem selecionados!");
        }
    }
    
    public static void setPessoa(JogoDaVelhaCampeonato pessoa) {
        AuxiliaCampeonato.pessoa[contador] = pessoa;
        System.out.println("Digite o nome do "+(contador+1)+" jogador:");
        AuxiliaCampeonato.pessoa[contador].setNome(s.nextLine());
        contador++;
    }

    public static int getContador() {
        return contador;
    }
    
    
}
