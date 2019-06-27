package ex01;

public class Context {
    private GameState gameState;

    public Context() {
        super();
    }

    public void init() {
        this.gameState = new NewGameState(this);
        this.gameState.succeed();
    }

    public void setState(GameState gameState) {
        this.gameState = gameState;
    }

    public void getHit() {
        this.gameState.failed();
    }

    public void passLevel() {
        this.gameState.succeed();
    }
}
