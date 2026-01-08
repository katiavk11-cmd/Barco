import java.util.List;

/**
 * CLASSE FILHA (CONCRETA): MotorPopa115
 * O 'extends' indica que esta classe herda todos os atributos e métodos de 'Motor'.
 * Dizemos que MotorPopa115 "É UM" Motor.
 */
class MotorPopa115 extends Motor {

    /**
     * CONSTRUTOR PADRÃO
     * Note que este motor não recebe parâmetros; ele já define seus dados fixos.
     * O comando 'super' chama o construtor da classe pai (Motor),
     * passando o nome específico e a lista de peças.
     */
    public MotorPopa115() {
        // List.of cria uma lista imutável, uma forma moderna e limpa de definir os componentes.
        super("Mercury 115HP", List.of("Hélice Alumínio", "Rotor", "Eixo"));
    }

    /**
     * SOBRESCRITA DE MÉTODO (@Override)
     * Aqui você está cumprindo o "contrato" da classe abstrata.
     * Enquanto o pai disse "todo motor deve produzir propulsão",
     * esta classe define EXATAMENTE como: multiplicando a intensidade por 2.5.
     */
    @Override
    public float produzirPropulsao(float intensidade) {
        // Lógica de negócio: Este motor é leve, então o ganho de velocidade é constante.
        return intensidade * 2.5f;
    }
}