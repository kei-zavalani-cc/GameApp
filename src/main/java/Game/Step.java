package Game;

public abstract class Step {
    protected int index;

    public Step(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public abstract void apply(Player player);


}
