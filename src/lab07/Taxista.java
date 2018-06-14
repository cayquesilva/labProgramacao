package lab07;

/**
 *
 * @author Cayque
 */
public class Taxista extends Contribuintes{
    
    private int passageirosAnual;
    private double kmAnual;
    private double totalCasa, totalCarro;
    private double armazenaCasa, ArmazenaCarro;
    
    public Taxista(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public int getPassageirosAnual() {
        return passageirosAnual;
    }

    public void setPassageirosAnual(int passageirosAnual) {
        this.passageirosAnual = passageirosAnual;
        super.setTributação(0.5*passageirosAnual);
    }

    public double getKmAnual() {
        return kmAnual;
    }

    public void setKmAnual(double kmAnual) {
        this.kmAnual = kmAnual;
        super.setDescontos(0.01*kmAnual);
    }

    public double getTotalCasa() {
        this.totalCasa = super.getValorCasa();
        return totalCasa;
    }

    public double getTotalCarro() {
        this.totalCarro = super.getValorCarro();
        return totalCarro;
    }

    public void setArmazenaCasa(){
        this.armazenaCasa +=getTotalCasa();
    }
    
    public void setArmazenaCarro(){
        this.armazenaCasa +=getTotalCarro();
    }
    
    public double getArmazenaCasa() {
        return armazenaCasa;
    }

    public double getArmazenaCarro() {
        return ArmazenaCarro;
    }
 
}
