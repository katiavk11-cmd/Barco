import java.util.List;

public abstract class Motor {
    private String nome;
    private Boolean ligado;
    private List<String> componentes; // Equivalente aos pistões

    public Motor(String nome, List<String> componentes) {
        this.nome = nome;
        this.componentes = componentes;
        this.ligado = false;
    }

    public String getNome() { return nome; }
    public void setLigado(Boolean ligado) { this.ligado = ligado; }
    public Boolean getLigado() { return ligado; }
    public List<String> getComponentes() { return componentes; }

    // O contrato: cada motor decide quanta força gera
    public abstract float produzirPropulsao(float intensidade);

    @Override
    public String toString() {
        return "Motor{nome='" + nome + "', ligado=" + ligado + ", componentes=" + componentes + "}";
    }
}