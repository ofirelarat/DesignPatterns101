package ex05;

public abstract class LogFunc implements ILogFunc {
    protected ILogFunc logFunc;

    public LogFunc(ILogFunc logFunc) {
        this.logFunc = logFunc;
    }
}
