/*Aluno 1: <Cayque Rennã Ferreira Silva*/
package lab04;

import java.util.Scanner;

/**
 *
 * @author Cayque
 */
public class MenuSeries {
 
    ProgressaoAritmetica pa;
    SerieFibonnacci fibo;
    private Scanner sc = new Scanner(System.in);
    private int primeiroTermo;
    private int razao;
    private int qntFibonacci;
    private int termosFibo;
    private int termoPa;
    private int termosGeral;
    
    
    
    public void chamarMenu(){
        System.out.println("\n********************************************************************************");
        System.out.println("** Escolha a opção desejada                                                   **");
        System.out.println("********************************************************************************");
        System.out.println("** 1 - Para criar uma progressão aritmética                                   **");
        System.out.println("** 2 - Para criar uma série Fibonacci                                         **");
        System.out.println("** 3 - Para ver o termo [N] da sua PA                                         **");
        System.out.println("** 4 - Para ver o termo [N] da serie de Fibonacci                             **");
        System.out.println("** 5 - Para mostrar os [N] primeiros termos da sua PA e da serie de Fibonacci **");
        System.out.println("** 6 - Para Sair.                                                             **");
        System.out.println("********************************************************************************");
        System.out.println("********************************************************************************");
    }
    
    
    public void menuCriarPa(){
        System.out.print("\nDigite o primeiro termo: ");
        primeiroTermo = sc.nextInt();
        System.out.print("Digite a razão da PA: ");
        razao = sc.nextInt();
        pa = new ProgressaoAritmetica(primeiroTermo, razao);
    }
    
    public void menuCriarFibonacci(){
        System.out.print("\nDigite a quantidade de termos da sequencia Fibonacci: ");
        qntFibonacci=sc.nextInt();
        fibo = new SerieFibonnacci(qntFibonacci);
    }

    public void menuVerTermoPa(){
        if(pa!=null){
            System.out.println("\nDigite o termo da PA que você deseja ver: ");
            termoPa = sc.nextInt();
            System.out.println("O termo ("+termoPa+") da PA é: " + pa.getTermo(termoPa));  
        }else{
            System.out.println("Primeiro você deve criar uma PA!!!!");
        }
    }
    
    public void menuVerTermoFibonacci(){
        if(fibo!=null){
            System.out.println("\nDigite o termo da serie Fibonacci que você deseja ver: ");
            termosFibo = sc.nextInt();
            System.out.println(fibo.seqFibonacci(termosFibo));    
        }else{
            System.out.println("Primeiro você deve criar uma sequência fibonacci");
        }
    }
    
    public void mostrarFiboEPa(){
        if(pa!=null && fibo!=null){
            System.out.println("\nDigite quantos termos você deseja ver da PA e da Série de Fibonacci: ");
            termosGeral = sc.nextInt();
            System.out.println("\nProg. Aritimética: "+pa.geraTermos(termosGeral));
            System.out.print("Seq. de Fibonacci:  [");
            for(int i=0;i<termosGeral-1;i++){
                System.out.print(fibo.seqFibonacci(i)+",");
            }
            System.out.println(fibo.seqFibonacci(termosGeral)+"]");
        }else{
            System.out.println("É preciso criar a PA e/ou a sequencia fibonacci!!!");
        }
    }
        
}
