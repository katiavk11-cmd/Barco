/**
 * CLASSE BARCO
 * Esta classe representa um exemplo clássico de "Composição" em POO.
 * Um Barco "tem um" Motor, permitindo que a lógica de propulsão seja delegada.
 */
public class Barco {
    // --- ATRIBUTOS (Estado do Objeto) ---
    // O uso de 'private' garante o Encapsulamento: o mundo externo só 
    // acessa esses dados através de métodos específicos (getters/setters).
    private String nome;
    private String cor;
    private String tipo; // Ex: Lancha, Veleiro, Iate

    // COMPOSIÇÃO: Aqui o Barco depende de outra classe (Motor) para funcionar.
    // Isso torna o sistema modular e fácil de dar manutenção.
    private Motor motor;

    // Representa o estado dinâmico do barco na água.
    private float velocidadeNos;

    /**
     * CONSTRUTOR
     * Inicializa o objeto com os dados obrigatórios para sua existência.
     * Note que a velocidade começa em 0.0f (padrão flutuante em Java).
     */
    public Barco(String nome, String tipo, Motor motor) {
        this.nome = nome;
        this.tipo = tipo;
        this.motor = motor;
        this.velocidadeNos = 0.0f; // Todo barco nasce parado (ancorado)
    }

    // --- MÉTODOS DE ACESSO (Getters e Setters) ---
    // Permitem ler ou alterar atributos privados de forma controlada.
    public void setCor(String cor) { this.cor = cor; }
    public String getCor() { return cor; }

    /**
     * MÉTODO LIGAR
     * Observe a delegação: o Barco não sabe ligar a si mesmo, 
     * ele ordena que seu objeto 'motor' altere o estado para ligado.
     */
    public void ligar() {
        this.motor.setLigado(true);
        System.out.println("Sistemas de " + nome + " acionados.");
    }

    /**
     * MÉTODO ACELERAR
     * Aqui existe uma REGRA DE NEGÓCIO: Só acelera se o motor permitir.
     * Além disso, a propulsão é calculada pelo motor, o Barco apenas 
     * acumula esse valor em sua velocidade atual.
     */
    public void acelerar() {
        // Verifica o estado do motor antes de permitir a ação
        if (this.motor.getLigado()) {
            // O barco pede propulsão ao motor (encapsulamento de lógica)
            this.velocidadeNos += this.motor.produzirPropulsao(1.0f);
        } else {
            System.out.println("Erro: Não é possível acelerar com o motor desligado!");
        }
    }

    // Retorna a velocidade atual para quem precisar consultar fora da classe
    public float getVelocidadeNos() { return velocidadeNos; }

    /**
     * MÉTODO toString
     * Sobrescrita (@Override) do método padrão da classe Object do Java.
     * É usado para gerar um relatório completo da situação do barco em formato Texto.
     * Usa um operador ternário ( ? : ) para exibir "Navegando" ou "Ancorado".
     */
    @Override
    public String toString() {
        return "BARCO: " + nome + " | TIPO: " + tipo + " | COR: " + cor +
                "\nESTADO: " + (motor.getLigado() ? "Navegando" : "Ancorado") +
                "\nVELOCIDADE: " + velocidadeNos + " nós" +
                "\nMOTORIZAÇÃO: " + motor; // Aqui o Java chamará automaticamente o toString do Motor
    }
}