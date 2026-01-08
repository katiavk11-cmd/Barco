public class Barco {
    private String nome;
    private String cor;
    private String tipo; // Ex: Lancha, Veleiro, Iate
    private Motor motor; // Composição
    private float velocidadeNos;

    public Barco(String nome, String tipo, Motor motor) {
        this.nome = nome;
        this.tipo = tipo;
        this.motor = motor;
        this.velocidadeNos = 0.0f;
    }

    public void setCor(String cor) { this.cor = cor; }
    public String getCor() { return cor; }

    public void ligar() {
        this.motor.setLigado(true);
        System.out.println("Sistemas de " + nome + " acionados.");
    }

    public void acelerar() {
        if (this.motor.getLigado()) {
            // O barco pede propulsão ao motor
            this.velocidadeNos += this.motor.produzirPropulsao(1.0f);
        } else {
            System.out.println("Erro: Não é possível acelerar com o motor desligado!");
        }
    }

    public float getVelocidadeNos() { return velocidadeNos; }

    @Override
    public String toString() {
        return "BARCO: " + nome + " | TIPO: " + tipo + " | COR: " + cor +
                "\nESTADO: " + (motor.getLigado() ? "Navegando" : "Ancorado") +
                "\nVELOCIDADE: " + velocidadeNos + " nós" +
                "\nMOTORIZAÇÃO: " + motor;
    }
}
