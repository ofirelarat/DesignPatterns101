package ex01;

public class FailedGameState extends GameState {
    public FailedGameState(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        System.out.println("game over lose");
    }

    @Override
    public void failed() {

    }

    @Override
    public void succeed() {

    }
}
