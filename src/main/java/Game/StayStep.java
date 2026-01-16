package Game;

public class StayStep extends SpecialStep{

    public StayStep(int index, int stepsToMove) {
        super(index, stepsToMove);
    }

    @Override
    public void apply(Player player) {
        player.setPosition(getIndex() + getStepsToMove());
        player.setSkipNextTurn(true);
    }
    @Override
    public void informPlayer(Player player) {
        System.out.println("This is a special step. " + player.getUsername() + " should stay in place for one round");
    }
}
