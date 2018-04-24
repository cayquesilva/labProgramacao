package lab03;

public class JogoDaVelhaCampeonato {
    
    private String nome;
    private int vitorias=0;
    private int derrotas=0;
    private int empates=0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias() {
        vitorias++;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas() {
        derrotas++;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates() {
        empates++;
    }
    
    
}
