package ex05;

public class ErrorLog extends LogFunc {
    public ErrorLog(ILogFunc logFunc) {
        super(logFunc);
    }

    @Override
    public String getMessage() {
        return this.logFunc.getMessage();
    }

    @Override
    public void executeLog() {
        System.out.println("Error: " + "print to file");

        this.logFunc.executeLog();
    }
}
