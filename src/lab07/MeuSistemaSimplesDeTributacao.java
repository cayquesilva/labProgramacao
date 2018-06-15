
package lab07;

import java.util.Scanner;

/**
 *
 * @author Cayque
 */
public class MeuSistemaSimplesDeTributacao {
    
    private static Taxista tax;
    private static Caminhoneiros cam;
    private static Medicos med;
    private static Professores prof;
    private static int opcao,escolha;
    private static Scanner sc = new Scanner(System.in);
    private static String nome;
    private static int numContribuinte;
    
    public static void main(String[] args) {
        
        do{
            showMenu();
            opcao=sc.nextInt();
            switch(opcao){
                case 1:
                    menuCadastro();
                    escolha=sc.nextInt();
                    switch(escolha){
                        case 1: // Caminhoneiro
                            System.out.println("Digite o nome do Caminhoneiro:");
                            nome=sc.next();
                            System.out.println("Digite o numero de contribuinte do caminhoneiro:");
                            numContribuinte=sc.nextInt();
                            cam = new Caminhoneiros(nome,numContribuinte);
                            System.out.println("Digite a KM anual do Caminhoneiro:");
                            cam.setKmAnual(sc.nextDouble());
                            System.out.println("Digite a quantidade de Toneladas carregadas pelo Caminhoneiro:");
                            cam.setToneladas(sc.nextDouble());
                            break;
                            
                        case 2: //Taxista
                            System.out.println("Digite o nome do Taxista:");
                            nome=sc.next();
                            System.out.println("Digite o numero de contribuinte do Taxista:");
                            numContribuinte=sc.nextInt();
                            tax = new Taxista(nome,numContribuinte);
                            System.out.println("Digite a Km Anual do Taxista");
                            tax.setKmAnual(sc.nextDouble());
                            System.out.println("Digite a quantidade de passageiros anuais do Taxista:");
                            tax.setPassageirosAnual(sc.nextInt());
                            break;
                            
                        case 3: //Professor
                            System.out.println("Digite o nome do Professor:");
                            nome=sc.next();
                            System.out.println("Digite o numero de contribuinte do professor:");
                            numContribuinte=sc.nextInt();
                            prof = new Professores(nome,numContribuinte);
                            System.out.println("Digite o salário do professor:");
                            prof.setSalario(sc.nextDouble());
                            break;
                            
                        case 4: //Médico
                            System.out.println("Digite o nome do Médico:");
                            nome=sc.next();
                            System.out.println("Digite o numero de contribuinte do médico:");
                            numContribuinte=sc.nextInt();
                            med = new Medicos(nome,numContribuinte);
                            System.out.println("Digite a quantidade de pacientes anuais do médico:");
                            med.setQuantPacientes(sc.nextInt());
                            break;
                            
                        case 0:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("-     impostos e descontos    -");
                    System.out.println("-------------------------------");
                    System.out.println("Os impostos do caminhoneiro "+cam.getNome()+" são: "+cam.getTributação());
                    System.out.println("Os impostos do médico "+med.getNome()+" são: "+med.getTributação());
                    System.out.println("Os impostos do Professor "+prof.getNome()+" são: "+prof.getTributação());
                    System.out.println("Os impostos do Taxista "+tax.getNome()+" são: "+tax.getTributação());
                    break;

                case 3:
                    menuRiqueza();
                    escolha=sc.nextInt();
                    switch(escolha){
                        case 1:
                            System.out.println(cam.getSinalRiqueza());
                            System.out.println(tax.getSinalRiqueza());
                            System.out.println(prof.getSinalRiqueza());
                            System.out.println(med.getSinalRiqueza());
                            break;
                            
                        case 2:
                            break;
                            
                        case 0:
                            break;
                    }
                    break;

                case 0:
                    
                    break;
            }
        }while(opcao!=0);
        
            
        

    }
    
    private static void showMenu(){
        System.out.println("-------------------------------");
        System.out.println("-        Menu de sistema      -");
        System.out.println("-------------------------------");
        System.out.println("-            Digite           -");
        System.out.println("- 1 para Cadastrar            -");
        System.out.println("- 2 para Impostos e Descontos -");
        System.out.println("- 3 para Sinais de Riqueza    -");
        System.out.println("- 0 para Sair                 -");   
        System.out.println("-------------------------------");
    }
    
    private static void menuCadastro(){
        System.out.println("-------------------------------");
        System.out.println("-      Menu de Cadastros      -");
        System.out.println("-------------------------------");
        System.out.println("-             Digite          -");
        System.out.println("- 1 para Caminhoneiro         -");
        System.out.println("- 2 para Taxista              -");
        System.out.println("- 3 para Professor            -");
        System.out.println("- 4 para Médico               -");
        System.out.println("- 0 para Voltar               -"); 
    }
    
    private static void menuRiqueza(){
        System.out.println("-------------------------------");
        System.out.println("-      Menu de Riquezas       -");
        System.out.println("-------------------------------");
        System.out.println("-            Digite           -");
        System.out.println("- 1 para Sinais Excessivos    -");
        System.out.println("- 2 para Sinais não Excessivos-");
        System.out.println("- 0 para Voltar               -");
        System.out.println("-------------------------------");
    }
}
