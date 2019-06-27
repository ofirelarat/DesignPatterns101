package ex01;

public class DuringGame extends GameState {

    private int lives;
    private int level;

    public DuringGame(Context context, int level, int lives) {
        super(context);
        this.level = level;
        this.lives = lives;
    }

    @Override
    public void failed() {
        System.out.println("you got hit");
        this.lives--;
        if (this.lives == 0) {
            this.context.setState(new FailedGameState(this.context));
        }
    }

    @Override
    public void succeed() {
        System.out.println("you pass a level");
        this.level++;
        if (this.level > 3) {
            this.context.setState(new WinGameState(this.context));
        }
    }
}
