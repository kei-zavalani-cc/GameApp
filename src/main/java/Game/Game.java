package Game;

import java.util.List;

public class Game {
    private List<Player> players;
    private Player winner;
    private GameVersion gameVersion;

    public void setGameVersion(GameVersion gameVersion) {
        this.gameVersion = gameVersion;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        Board board = new Board();
        board.initializeSteps();
        board.initializeSpecialSteps();
        return board;
    }

    public Dice getDice() {
        Dice dice = new Dice();
        return dice;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void playTurn(Player player) {
        gameVersion.playTurn(this, player);
    }

    public boolean checkVersion(String version) {
        switch (version) {
            case "AT60":
                setGameVersion(new At60Version());
                return true;
            case "OVER60":
                setGameVersion(new Over60Version());
                return true;
            default:
                System.out.println("The version is invalid");
                return false;
        }
    }
}
