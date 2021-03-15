import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Player> players;
    public static UI ui;
    public static void main(String[] args) {

        ui = new UI();

        players = ui.createPlayers();

        // printPlayers();

        saveGameData();

        System.out.println(getPlayerByID(0));
        String nameOfPlayer0 = getPlayerByID(0).getName();
        System.out.println(getPlayerByName(nameOfPlayer0));

    }

    public static void printPlayers() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i));
        }
    }

    public static void saveGameData() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("data.txt");
            writer.write(getGameData());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (NullPointerException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static ArrayList<Player> readGameData() {
        return null;
    }

    public static Player getPlayerByID(int id) {
        for (Player p : players) {
            if (p.getId() == id) {
                return p;
            }
        }
        System.out.println("There is no player with ID " + id);
        return null;
    }

    public static Player getPlayerByName(String name) {
        for (Player p : players) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        System.out.println("There is no player with the name " + name);
        return null;
    }

    public static String getGameData() {
        StringBuilder gameData = new StringBuilder();
        for (Player p : players) {
            // id:name:account balance
            String playerData = String.format("%d:%s:%.2f\n", p.getId(), p.getName(), p.getBankAccount().getBalance());
            gameData.append(playerData);
        }
        return gameData.toString();
    }
}
