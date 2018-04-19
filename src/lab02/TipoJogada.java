package lab02;

/**
 *
 * @author Cayque
 */
public enum TipoJogada {
    PEDRA(1,"Pedra"), PAPEL(2,"Papel"), TESOURA(3,"Tesoura");

    private final int tipo;
    private final String nome;
    
    private TipoJogada(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }


    
}
