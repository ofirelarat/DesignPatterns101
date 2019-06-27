package ex05;

public class InfoLog extends LogFunc {

    public InfoLog(ILogFunc logFunc) {
        super(logFunc);
    }

    @Override
    public String getMessage() {
        return this.logFunc.getMessage();
    }

    @Override
    public void executeLog() {
        System.out.println("info: " + getMessage());

        this.logFunc.executeLog();
    }
}
