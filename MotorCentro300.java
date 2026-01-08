import java.util.List;

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
