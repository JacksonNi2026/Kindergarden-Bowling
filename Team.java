import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String name) {
        players.removeIf(player -> player.getName().equals(name));
    }

    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore());
        }
    }
}
