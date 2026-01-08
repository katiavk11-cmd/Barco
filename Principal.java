/**
 * CLASSE PRINCIPAL
 * Este é o ponto de entrada (entry point) do programa.
 * Aqui os objetos deixam de ser apenas código e passam a existir na memória.
 */
public class Principal {
    public static void main(String[] args) {

        // --- BLOCO 1: INSTANCIAÇÃO E POLIMORFISMO ---
        // Note que passamos 'new MotorPopa115()' e 'new MotorCentro300()' para o construtor do Barco.
        // O Barco aceita ambos porque ambos são, tecnicamente, um "Motor".
        Barco lancha = new Barco("Ventura 190", "Lancha", new MotorPopa115());
        lancha.setCor("Branco");

        Barco iate = new Barco("Ventura 270", "Iate", new MotorCentro300());
        iate.setCor("Azul");

        // --- BLOCO 2: MUDANÇA DE ESTADO ---
        // Aqui alteramos o atributo 'ligado' dentro do motor de cada barco.
        lancha.ligar();
        iate.ligar();

        System.out.println("\n--- INICIANDO TESTE DE ACELERAÇÃO (3X) ---");

        // --- BLOCO 3: REPETIÇÃO E LÓGICA DE NEGÓCIO ---
        // Usamos um laço 'for' para simular o tempo passando ou o acelerador sendo pressionado.
        for (int i = 1; i <= 3; i++) {
            lancha.acelerar(); // Aumenta de 2.5 em 2.5
            iate.acelerar();   // Aumenta de 4.2 em 4.2

            // Aqui vemos o Polimorfismo em ação: o mesmo método 'acelerar()'
            // produz resultados diferentes dependendo do motor que o barco possui.
            System.out.println("Rodada " + i + " -> Lancha: " + lancha.getVelocidadeNos() + " nós | Iate: " + iate.getVelocidadeNos() + " nós");
        }

        // --- BLOCO 4: RELATÓRIO FINAL ---
        // Ao imprimir 'lancha' e 'iate', o Java chama automaticamente o toString() de cada um.
        System.out.println("\n--- RESULTADO FINAL DAS EMBARCAÇÕES ---");
        System.out.println(lancha);
        System.out.println("--------------------------------------------------");
        System.out.println(iate);
    }
}