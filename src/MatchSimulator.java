package src;

import java.util.Random;

public class MatchSimulator {

    private Random random = new Random();

    public void simularPartida(Player player1, Player player2) {

        if (player1 == null || player2 == null) {
            System.out.println("JUGADOR NO VALIDO");
            return;
        }

        if (player1 == player2) {
            System.out.println("NO SE PUEDE USAR EL MISMO JUGADOR");
            return;
        }

        System.out.println("=================================================");
        System.out.println("║              SIMULACIÓN DE PARTIDA            ║");
        System.out.println("=================================================");

        System.out.println(player1.getNickname() + " VS " + player2.getNickname());
        System.out.println("-----------------------------");

        int result = random.nextInt(3);

        if (result == 0) {
            System.out.println("-----------------------------");
            System.out.println("GANA: " + player1.getNickname());
            player1.setPuntos(player1.getPuntos() + 10);

        } else if (result == 1) {
            System.out.println("-----------------------------");
            System.out.println("GANA: " + player2.getNickname());
            player2.setPuntos(player2.getPuntos() + 10);
            System.out.println("-----------------------------");

        } else {
            System.out.println("-----------------------------");
            System.out.println("QUEDARON EMPATES");
            player1.setPuntos(player1.getPuntos() + 5);
            player2.setPuntos(player2.getPuntos() + 5);
            System.out.println("-----------------------------");
        }

        System.out.println("\nPUNTOS ACTUALIZADOS:");
        System.out.println("------------------------------");
        System.out.println(player1.getNickname() + ": " + player1.getPuntos());
        System.out.println(player2.getNickname() + ": " + player2.getPuntos());
        System.out.println("==============================");
    }
}
