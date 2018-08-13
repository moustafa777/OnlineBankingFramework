package com.mum.asd.OnlineBankingFramework.logging;

public class LoggingDirector {
    public static LogType logtype;

    private LoggingDirector logDir;

    public void performLog(LogInfo log) {
        if (logtype == logtype.Text) {
            // implement text here
        } else if (logtype == logtype.Database) {
            // implement Database log here
        } else if (logtype == logtype.Console) {
            // implement Console log here
        }
    }


    public LogType getLogtype() {
        return logtype;
    }

    public void setLogtype(LogType logtype) {
        this.logtype = logtype;
    }

    public LoggingDirector getLogDir() {
        if (logDir != null) {
            logDir = new LoggingDirector();
        }
        return logDir;
    }
}
