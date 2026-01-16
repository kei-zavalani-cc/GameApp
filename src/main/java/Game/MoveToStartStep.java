package Game;

public class MoveToStartStep extends SpecialStep {
    public MoveToStartStep(int index, int stepsToMove) {
        super(index, stepsToMove);
    }

    @Override
    public void apply(Player player) {
        player.resetPosition();
    }

    @Override
    public void informPlayer(Player player) {
        System.out.println("This is a special step. " + player.getUsername() + " should start from the beginning");
    }
}
