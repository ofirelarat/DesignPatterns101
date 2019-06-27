package ex05;

public class BaseLog implements ILogFunc {

    String message;

    public BaseLog(String m) {
        this.message = m;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void executeLog() {

    }
}
