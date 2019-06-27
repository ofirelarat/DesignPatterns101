package ex01;

public abstract class GameState {
    protected Context context;

    public GameState(Context context) {
        super();
        this.context = context;
    }

    public abstract void succeed();

    public abstract void failed();
}