package lab07;

/**
 *
 * @author Cayque
 */
public class Contribuintes {
    
    private String nome;
    private int numeroDeContribuinte;
    private int quantContribuintes=0;
    private boolean casa, carro;
    private double valorCasa, valorCarro;
    private double tributação;
    private double descontos;

    
    public Contribuintes(String nome, int numeroDeContribuinte) {
        this.nome = nome;
        this.numeroDeContribuinte = numeroDeContribuinte;
        quantContribuintes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeContribuinte() {
        return numeroDeContribuinte;
    }

    public void setNumeroDeContribuinte(int numeroDeContribuinte) {
        this.numeroDeContribuinte = numeroDeContribuinte;
    }

    public boolean temCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public boolean temCarro() {
        return carro;
    }

    public void setCarro(boolean carro) {
        this.carro = carro;
    }

    public double getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(double valorCasa) {
        this.valorCasa = valorCasa;
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public int getQuantContribuintes() {
        return quantContribuintes;
    }

    public double getTributação() {
        return tributação;
    }

    public void setTributação(double tributo) {
        this.tributação = tributo;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double desconto) {
        this.descontos = desconto;
    }
    
    
    
}
