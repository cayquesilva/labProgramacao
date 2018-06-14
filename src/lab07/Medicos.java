package lab07;

/**
 *
 * @author Cayque
 */
public class Medicos extends Contribuintes{
    
    private int quantPacientes;
    private double despesaCongressos;
    private double totalCasa, totalCarro;
    private double armazenaCasa, ArmazenaCarro;
    
    public Medicos(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public int getQuantPacientes() {
        return quantPacientes;
    }

    public void setQuantPacientes(int quantPacientes) {
        this.quantPacientes = quantPacientes;
        super.setTributação(10*quantPacientes);
    }

    public double getDespesaCongressos() {
        return despesaCongressos;
    }

    public void setDespesaCongressos(double despesaCongressos) {
        this.despesaCongressos = despesaCongressos;
        super.setDescontos(despesaCongressos);
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
