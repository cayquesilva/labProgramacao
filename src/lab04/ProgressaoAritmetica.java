/*Aluno 1: <Cayque Rennã Ferreira Silva*/
package lab04;

/**
 *
 * @author Cayque
 */
public class ProgressaoAritmetica {
    
    private int primeiroTermo;
    private int proximoTermo;
    private int razao;

    public ProgressaoAritmetica(int primeiroTermo, int razao) {
        this.primeiroTermo = primeiroTermo;
        this.razao = razao;
    }

    public int getPrimeiroTermo() {
        proximoTermo=primeiroTermo;
        return primeiroTermo;
    }

    public int getRazao() {
        return razao;
    }
    
    public int getProximoTermo(){
        proximoTermo+=getRazao();
        return proximoTermo;
    }
    
    public int getTermo(int num){
        int termo = (getPrimeiroTermo()+(num-1)*getRazao());
        proximoTermo=termo;
        return termo;
    }
    
    public String geraTermos(int num){
        String termos;
        termos=("["+getPrimeiroTermo());
        for(int i = 1;i < num-1; i ++){
            termos+=(","+getProximoTermo());
        }termos+=(","+getProximoTermo()+"]");
        return termos;
    }
    
}
