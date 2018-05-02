/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.util.Scanner;

/**
 * Classe para manipular series matematicas (Usando uma classe ProgressaoAritmetica).
 *
 */
public class ExplorandoOMundoDasSeries {
    public static void main(String[] args) {
        
        MenuSeries menu = new MenuSeries();
        Scanner op = new Scanner(System.in);
        int opcao;
        
        do{
            menu.chamarMenu();
            opcao = op.nextInt();
            switch(opcao){

                case 1:
                    //Chama a criação da PA.
                    menu.menuCriarPa();
                    break;

                case 2:
                    //Chama a criação da Serie Fibonacci.
                    menu.menuCriarFibonacci();
                    break;

                case 3:
                    //Mostra termo escolhido da PA.
                    menu.menuVerTermoPa();
                    break;

                case 4:
                    //Mostra termo escolhido da Serie Fibonacci.
                    menu.menuVerTermoFibonacci();
                    break;

                case 5:
                    //Mostra a PA e a Serie Fibonacci.
                    menu.mostrarFiboEPa();
                    break;

                case 6:
                    //Sair.
                    break;

            }
        }while(opcao!=6);
    }
}