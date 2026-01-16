package Game;

public class At60Version implements GameVersion{
    @Override
    public void playTurn(Game game, Player player) {
        int roll = 0;
        int position = player.getPosition();
        int newPosition = 0;
        if (player.isNextTurnSkipped()) {
            player.setSkipNextTurn(false);
        }
        else {
            roll = game.getDice().roll();
            newPosition = position + roll;

            if (newPosition > 60) {
                if (roll != 0) System.out.println(player.getUsername() + " rolled " + roll + ". They are " +
                        "staying in place " + position);
                return;
            }
            game.getBoard().getStep(newPosition).apply(player);
        }
        if (newPosition == 60) {
            game.setWinner(player);}
        if (roll != 0) {
            System.out.println(player.getUsername() + " rolled " + roll + " -> moved from " +position+ " to " + newPosition);
            if (game.getBoard().getStep(newPosition) instanceof SpecialStep) {
                ((SpecialStep) game.getBoard().getStep(newPosition)).informPlayer(player);
            }
        }
        else System.out.println(player.getUsername() + " is skipping this turn");
    }
}
