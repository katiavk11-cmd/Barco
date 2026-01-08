import java.util.List;

/**
 * CLASSE FILHA (CONCRETA): MotorCentro300
 * Esta classe representa um motor de alto desempenho.
 * Note que ela segue a mesma estrutura da MotorPopa115, mas com dados diferentes.
 */
class MotorCentro300 extends Motor {

    /**
     * CONSTRUTOR PADRÃO
     * O uso do 'super' aqui carrega uma lista de componentes mais complexa.
     * Isso enriquece o estado do objeto, permitindo que o método toString()
     * do pai mostre detalhes específicos desta peça de engenharia.
     */
    public MotorCentro300() {
        // Dados específicos de um motor de centro (mais robusto)
        super("Volvo Penta V8 300HP", List.of("Hélice Dupla", "Rabeta", "Cardã", "Resfriador"));
    }

    /**
     * SOBRESCRITA DE MÉTODO (@Override)
     * Polimorfismo na prática: O Barco não sabe qual motor possui, mas sabe
     * que se chamar este método em um 'MotorCentro300', receberá 4.2f de força.
     */
    @Override
    public float produzirPropulsao(float intensidade) {
        // Lógica de negócio: Fator de propulsão significativamente maior (4.2f)
        return intensidade * 4.2f;
    }
}