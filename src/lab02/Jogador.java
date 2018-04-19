package lab02;

/**
 *
 * @author Cayque
 */
public class Jogador {
    
    private TipoJogada tipojogada;
    private int jogada;
    
    public Jogador(int jogada) {
        this.jogada = jogada;
        setTipojogada(this);
    }

    public TipoJogada getTipojogada() {
        return tipojogada;
    }
    
    public int getJogada() {
        return jogada;
    }

    public void setTipojogada(Jogador jogador) {
        switch (jogador.getJogada()) {
            case 3:
                this.tipojogada = tipojogada.TESOURA;
                break;
            case 2:
                this.tipojogada = tipojogada.PAPEL;
                break;
            case 1:
                this.tipojogada = tipojogada.PEDRA;
                break;
            default:
                break;
        }
    }
    
    

}
