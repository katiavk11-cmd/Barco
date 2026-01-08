import java.util.List;

/**
 * CLASSE ABSTRATA MOTOR
 * O modificador 'abstract' indica que esta classe não pode ser instanciada diretamente.
 * Ela serve apenas como uma "superclasse" (pai) para tipos específicos de motores.
 */
public abstract class Motor {
    // --- ATRIBUTOS ---
    private String nome;
    private Boolean ligado;

    // O uso de List<String> demonstra flexibilidade.
    // Representa a estrutura interna do motor (como pistões ou bobinas).
    private List<String> componentes;

    /**
     * CONSTRUTOR
     * Mesmo sendo abstrata, a classe tem um construtor para que as classes
     * filhas possam inicializar esses atributos comuns.
     */
    public Motor(String nome, List<String> componentes) {
        this.nome = nome;
        this.componentes = componentes;
        this.ligado = false; // Estado inicial padrão
    }

    // --- MÉTODOS DE ACESSO (Encapsulamento) ---
    public String getNome() { return nome; }
    public void setLigado(Boolean ligado) { this.ligado = ligado; }
    public Boolean getLigado() { return ligado; }
    public List<String> getComponentes() { return componentes; }

    /**
     * MÉTODO ABSTRATO (O Contrato)
     * Este é o coração do Polimorfismo.
     * Ele não tem corpo (chaves { }) aqui porque a "receita" de como gerar
     * propulsão depende do tipo de motor.
     * Cada classe que herdar de 'Motor' SERÁ OBRIGADA a implementar este método.
     */
    public abstract float produzirPropulsao(float intensidade);

    /**
     * MÉTODO toString
     * Facilita a depuração (debug), mostrando o estado atual do motor
     * de forma textual quando o Barco for exibido.
     */
    @Override
    public String toString() {
        return "Motor{nome='" + nome + "', ligado=" + ligado + ", componentes=" + componentes + "}";
    }
}