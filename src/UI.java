import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UI {

    /**
     * Query user for players' names.
     * Get those using getUserInput().
     * @return ArrayList<Player>
     */
    public ArrayList<Player> createPlayers() {
        final int MAX_PLAYERS = 6;

        // Get names of players
        ArrayList<Player> players = new ArrayList<Player>();
        int count = 0;
        while (players.size() < MAX_PLAYERS) {
            String playerName = getUserInput("Skriv navnet på spiller " + count + ", Q for at afslutte: ");
            if (playerName.toLowerCase().equals("q")) {
                break;
            }
            players.add(new Player(playerName, 30000f));
            count++;
        }

        return players;
    }


    /**
     * Give a message in System.out.
     * Get input from System.in.
     * @param msg
     * @return String
     */
    public String getUserInput(String msg){
        System.out.println(msg);
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
