package lab07;

/**
 *
 * @author Cayque
 */
public class Caminhoneiros extends Contribuintes{
    
    private double toneladas;
    private double kmAnual;
    private double sinalRiqueza;
    
    public Caminhoneiros(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public double getToneladas() {
        return toneladas;
    }

    public boolean setToneladas(double toneladas) {
        if(toneladas >=0){
           this.toneladas = toneladas;
            setTributação(toneladas);
            return true; 
        }else{
            return false;
        } 
    }

    public double getKmAnual() {
        return kmAnual;
    }

    public boolean setKmAnual(double kmAnual) {
        if(kmAnual>=0){
            this.kmAnual = kmAnual;
            super.setDescontos(0.01*kmAnual);   
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public void setTributação(double tributo){
        if(getToneladas()<=10){
            super.setTributação(500);
        }else{
            super.setTributação(500+(100*(getToneladas()-10)));
        }
    }

    @Override
    public double getSinalRiqueza() {
        return sinalRiqueza;
    }

    @Override
    public void setSinalRiqueza() {
        this.sinalRiqueza += getValorCasa()+getValorCasa();
    }
 
    
}
