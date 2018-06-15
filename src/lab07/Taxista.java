package lab07;

/**
 *
 * @author Cayque
 */
public class Taxista extends Contribuintes{
    
    private int passageirosAnual;
    private double kmAnual;
    private double sinalRiqueza;
    
    public Taxista(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public int getPassageirosAnual() {
        return passageirosAnual;
    }

    public boolean setPassageirosAnual(int passageirosAnual) {
        if(passageirosAnual>=0){
            this.passageirosAnual = passageirosAnual;
            super.setTributação(0.5*passageirosAnual);  
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
    public double getSinalRiqueza() {
        return sinalRiqueza;
    }

    @Override
    public void setSinalRiqueza() {
        this.sinalRiqueza += getValorCasa()+getValorCasa();
    }
 
}
