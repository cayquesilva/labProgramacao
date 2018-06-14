package lab07;

/**
 *
 * @author Cayque
 */
public class Professores extends Contribuintes{
    
    private double salario, materialDidatico;
    private final double salarioMinino = 954;
    private double totalCasa, totalCarro;
    private double armazenaCasa, ArmazenaCarro;
    
    public Professores(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        setTributação(salario);
    }
    
    public void setMaterialDidatico(double material){
        this.materialDidatico = material;
        super.setDescontos(material/2);
    }
    
    public double getMaterialDidatico(){
        return materialDidatico;
    }
    
    @Override
    public void setTributação(double tributo){
        if(getSalario()/salarioMinino < 1){
            super.setTributação(getSalario()*0.05);
        }else{
            if(getSalario()/salarioMinino <= 5){
                super.setTributação(getSalario()*0.1);
            }else{
                super.setTributação(getSalario()*0.2);
            }
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
