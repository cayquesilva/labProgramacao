package lab07;

/**
 *
 * @author Cayque
 */
public class Medicos extends Contribuintes{
    
    private int quantPacientes;
    private double despesaCongressos;
    private double sinalRiqueza;
    public Medicos(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public int getQuantPacientes() {
        return quantPacientes;
    }

    public boolean setQuantPacientes(int quantPacientes) {
        if(quantPacientes>=0){
            this.quantPacientes = quantPacientes;
            super.setTributação(10*quantPacientes);  
            return true;
        }else{
            return false;
        }
    }

    public double getDespesaCongressos() {
        return despesaCongressos;
    }

    public boolean setDespesaCongressos(double despesaCongressos) {
        if(despesaCongressos>=0){
            this.despesaCongressos = despesaCongressos;
            super.setDescontos(despesaCongressos); 
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
