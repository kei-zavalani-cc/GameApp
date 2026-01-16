package Game;

public class NormalStep extends Step {

    public NormalStep(int index) {
        super(index);
    }

    @Override
    public void apply(Player player) {
        player.setPosition(index);
    }
}
