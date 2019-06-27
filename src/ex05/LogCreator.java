package ex05;

public class LogCreator {
    public static ILogFunc createLog(String m, LogLevel level){
        BaseLog baseLog =  new BaseLog(m);
        switch (level){
            case info:
                return new InfoLog(baseLog);
            case error:
                return new ErrorLog(new InfoLog(baseLog));
            case fatal:
                return new FatalLog(new ErrorLog(baseLog));
        }

        return baseLog;
    }

    public enum LogLevel{
        info,
        error,
        fatal
    }
}

