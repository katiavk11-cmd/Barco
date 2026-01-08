import java.util.List;

// Motor de Popa (Mais leve, menos força por acelerada)
class MotorPopa115 extends Motor {
    public MotorPopa115() {
        super("Mercury 115HP", List.of("Hélice Alumínio", "Rotor", "Eixo"));
    }
    @Override
    public float produzirPropulsao(float intensidade) {
        return intensidade * 2.5f;
    }
}

