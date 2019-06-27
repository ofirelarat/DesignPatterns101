package ex01;

public class WinGameState extends GameState {
    public WinGameState(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        System.out.println("you win the Game!");
    }

    @Override
    public void failed() {

    }

    @Override
    public void succeed() {

    }
}