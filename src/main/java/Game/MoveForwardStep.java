package Game;

public class MoveForwardStep extends SpecialStep {

    public MoveForwardStep(int index, int stepsToMove) {
        super(index, stepsToMove);
    }

    @Override
    public void apply(Player player) {
        player.setPosition(getIndex() + getStepsToMove());
    }

    @Override
    public void informPlayer(Player player) {
        System.out.println("This is a special step. " + player.getUsername() + " should move "
                + getStepsToMove() + " steps forward.\n" +
                player.getUsername() + " moved to " + player.getPosition());
    }
}
