package lab07;

/**
 *
 * @author Cayque
 */
public class Caminhoneiros extends Contribuintes{
    
    private double toneladas;
    private double kmAnual;
    private double totalCasa, totalCarro;
    private double armazenaCasa, ArmazenaCarro;
    
    public Caminhoneiros(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
        setTributação(toneladas);
    }

    public double getKmAnual() {
        return kmAnual;
    }

    public void setKmAnual(double kmAnual) {
        this.kmAnual = kmAnual;
        super.setDescontos(0.01*kmAnual);
    }
    
    @Override
    public void setTributação(double tributo){
        if(getToneladas()<=10){
            super.setTributação(500);
        }else{
            super.setTributação(500+(100*(getToneladas()-10)));
        }
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
