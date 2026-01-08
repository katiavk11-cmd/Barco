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

// Motor Centro-Rabeta (Mais pesado, muito mais força)
class MotorCentro300 extends Motor {
    public MotorCentro300() {
        super("Volvo Penta V8 300HP", List.of("Hélice Dupla", "Rabeta", "Cardã", "Resfriador"));
    }
    @Override
    public float produzirPropulsao(float intensidade) {
        return intensidade * 4.2f;
    }
}
