package Game;

public abstract class SpecialStep extends Step {
    private int stepsToMove;

    public SpecialStep(int index, int stepsToMove) {
        super(index);
        this.stepsToMove = stepsToMove;
    }

    public int getStepsToMove() {
        return stepsToMove;
    }

    public abstract void apply(Player player);
    public abstract void informPlayer(Player player);
}
