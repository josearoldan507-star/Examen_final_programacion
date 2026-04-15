import java.util.Scanner;

class Player {
    String nickname;
    int level;
    int points;

    public Player(String nickname, int level, int points) {
        this.nickname = nickname;
        this.level = level;
        this.points = points;
    }
}

public class PlayerManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[20];
        int count = 6;

        players[0] = new Player("Jose", 13, 250);
        players[1] = new Player("Angela", 15, 400);
        players[2] = new Player("Maria", 18, 450);
        players[3] = new Player("Iris", 20, 600);
        players[4] = new Player("Diego", 12, 350);
        players[5] = new Player("Manuel", 10, 200);

        int option;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. View leaderboard");
            System.out.println("2. Add player");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();

            if (option == 1) {

                for (int i = 0; i < count - 1; i++) {
                    for (int j = 0; j < count - 1; j++) {
                        if (players[j].points < players[j + 1].points) {

                            Player temp = players[j];
                            players[j] = players[j + 1];
                            players[j + 1] = temp;
                        }
                    }
                }

                System.out.println("\n===== LEADERBOARD =====");
                System.out.println("Nickname\tLevel\tPoints");
                System.out.println("--------------------------------");

                for (int i = 0; i < 5 && i < count; i++) {
                    System.out.println(
                        players[i].nickname + "\t" +
                        players[i].level + "\t" +
                        players[i].points
                    );
                }

            } else if (option == 2) {

                if (count < players.length) {
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter nickname: ");
                    String nickname = sc.nextLine();

                    System.out.print("Enter level: ");
                    int level = sc.nextInt();

                    System.out.print("Enter points: ");
                    int points = sc.nextInt();

                    players[count] = new Player(nickname, level, points);
                    count++;

                    System.out.println("Player added successfully.");
                } else {
                    System.out.println("No space for more players.");
                }

            }

        } while (option != 3);

        System.out.println("Program finished.");
    }
}