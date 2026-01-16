package db;
import java.sql.Connection;
import java.sql.Statement;
public class DBInitializer {
    public static void init() {
        String sql = """
            CREATE TABLE IF NOT EXISTS GAME_RESULTS (
                GAME_ID INT AUTO_INCREMENT PRIMARY KEY,
                P1 INT,
                P2 INT,
                P3 INT,
                P4 INT
            )
        """;

        try (Connection conn = DBConfig.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize database", e);
        }
    }
}
