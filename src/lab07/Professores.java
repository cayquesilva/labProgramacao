package lab07;

/**
 *
 * @author Cayque
 */
public class Professores extends Contribuintes{
    
    private double salario, materialDidatico;
    private final double salarioMinino = 954;
    private double sinalRiqueza;
    
    public Professores(String nome, int numeroDeContribuinte) {
        super(nome, numeroDeContribuinte);
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if(salario>0){
            this.salario = salario;
            setTributação(salario); 
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setMaterialDidatico(double material){
        if(material>=0){
            this.materialDidatico = material;
            super.setDescontos(material/2);  
            return true;
        }else{
            return false;
        }      
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

    @Override
    public double getSinalRiqueza() {
        return sinalRiqueza;
    }

    @Override
    public void setSinalRiqueza() {
        this.sinalRiqueza += getValorCasa()+getValorCasa();
    }
    
}
