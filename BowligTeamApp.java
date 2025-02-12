import java.util.Scanner;

public class BowligTeamApp {
    public static void main(String[] args) {
        Team team = new Team();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. View Players");
            System.out.println("4. Update Score");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = scanner.nextLine();
                    team.addPlayer(new Player(name));
                    break;
                case 2:
                    System.out.print("Enter player name to remove: ");
                    String removeName = scanner.nextLine();
                    team.removePlayer(removeName);
                    break;
                case 3:
                    team.displayPlayers();
                    break;
                case 4:
                    System.out.print("Enter player name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter points to add: ");
                    int points = scanner.nextInt();
                    // Logic to update player score
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
