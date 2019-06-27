package ex01;

public class NewGameState extends GameState {

    public NewGameState(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public void failed() {
        this.context.setState(new FailedGameState(this.context));
    }

    @Override
    public void succeed() {
        this.context.setState(new DuringGame(this.context, 1, 50));
    }
}