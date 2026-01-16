package Game;

public class MoveBackwardStep extends SpecialStep {

    public MoveBackwardStep(int index, int stepsToMove) {
        super(index, stepsToMove);
    }

    @Override
    public void apply(Player player) {

        player.setPosition(getIndex() - getStepsToMove());
    }

    @Override
    public void informPlayer(Player player) {
        System.out.println("This is a special step. " + player.getUsername() + " should move "
                + getStepsToMove() + " steps backward.\n" +
                player.getUsername() + " moved to " + player.getPosition());
    }
}
