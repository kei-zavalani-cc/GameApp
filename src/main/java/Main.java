import Game.Game;
import db.DBInitializer;
import db.GamesRepo;
import Game.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Game and DB initialization and game setup
    public static void main(String[] args) {
        DBInitializer.init();
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many players are playing? Choose from 1 to 4: ");
        int noOfPlayers = scanner.nextInt();
        while(noOfPlayers < 1 || noOfPlayers > 4) {
            System.out.println("Invalid number. Please enter a number between 1 and 4: ");
            noOfPlayers = scanner.nextInt();
        }

        List<Player> gamePlayers = new ArrayList<>();
        for(int i = 1; i <= noOfPlayers; i++) {
            System.out.print("Enter the Name of Player " + i + ": ");
            String name = scanner.next();
            Player player = new Player(name);
            gamePlayers.add(player);
        }
        game.setPlayers(gamePlayers);

        System.out.println("Enter game version (at60 or over60): ");
        boolean validVersion = false;
        while (!validVersion) {
            String version = scanner.next().toUpperCase();
            validVersion = game.checkVersion(version);

            if (!validVersion) {
                System.out.println("Please enter 'at60' or 'over60': ");
            }
        }

        int turnCount = 1;
        while (game.getWinner() == null) {
            System.out.println("Turn " + turnCount);
            for(Player player : game.getPlayers()) {
                game.playTurn(player);
                if(player.equals(game.getWinner())) break;
            }
            System.out.println();
            turnCount++;
        }
        System.out.println("Winner is " + game.getWinner().getUsername());

        GamesRepo repository = new GamesRepo();
        repository.saveGameResult(game);
    }
}
