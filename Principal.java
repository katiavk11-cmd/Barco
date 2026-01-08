public class Principal {
    public static void main(String[] args) {
        // Criando os dois barcos com motores diferentes
        Barco lancha = new Barco("Ventura 190", "Lancha", new MotorPopa115());
        lancha.setCor("Branco");

        Barco iate = new Barco("Ventura 270", "Iate", new MotorCentro300());
        iate.setCor("Azul");

        // Ligando os motores
        lancha.ligar();
        iate.ligar();

        System.out.println("\n--- INICIANDO TESTE DE ACELERAÇÃO (3X) ---");

        // Executando 3 acelerações em cada
        for (int i = 1; i <= 3; i++) {
            lancha.acelerar();
            iate.acelerar();
            System.out.println("Rodada " + i + " -> Lancha: " + lancha.getVelocidadeNos() + " nós | Iate: " + iate.getVelocidadeNos() + " nós");
        }

        System.out.println("\n--- RESULTADO FINAL DAS EMBARCAÇÕES ---");
        System.out.println(lancha);
        System.out.println("--------------------------------------------------");
        System.out.println(iate);
    }
}