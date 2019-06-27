package ex05;

public class FatalLog extends  LogFunc {
    public FatalLog(ILogFunc logFunc) {
        super(logFunc);
    }

    @Override
    public String getMessage() {
        return this.logFunc.getMessage();
    }

    @Override
    public void executeLog() {
        System.out.println("Fatal: " + "do SMS");

        this.logFunc.executeLog();
    }
}
