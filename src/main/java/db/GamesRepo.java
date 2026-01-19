package db;
import Game.Game;
import Game.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class GamesRepo {
    public void saveGameResult(Game game) {

        List<Player> players = game.getPlayers();
        Player winner = game.getWinner();

        String sql = """
                    INSERT INTO GAME_RESULTS (Player1, Player2, Player3, Player4)
                    VALUES (?, ?, ?, ?)
                """;

        try (Connection conn = DBConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (int i = 0; i < 4; i++) {
                if (i < players.size() && players.get(i).equals(winner)) {
                    ps.setInt(i + 1, 1);   // winner
                } else {
                    ps.setInt(i + 1, 0);   // not winner / no player
                }
            }

            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Failed to save game result", e);
        }
    }
}
