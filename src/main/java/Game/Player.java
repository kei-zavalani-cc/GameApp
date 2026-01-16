package Game;

public class Player {
    private int player_id;
    private String username;

    private int position;

    private boolean nextTurnSkipped;

    public Player(String username) {
        this.username = username;
        this.position = 0;
        this.nextTurnSkipped = false;
    }

    public boolean isNextTurnSkipped() {
        return nextTurnSkipped;
    }
    public void setSkipNextTurn(boolean skipNextTurn) {
        this.nextTurnSkipped = skipNextTurn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void resetPosition() {
        position = 0;
    }
}
