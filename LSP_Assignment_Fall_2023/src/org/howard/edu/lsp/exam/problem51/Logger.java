package org.howard.edu.lsp.exam.problem51;

public class Logger {
    private String log;
    private static Logger instance;

    // Private constructor to prevent external instantiation
    private Logger() {
        this.log = "";
    }

    // Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void logMessage(String message) {
        this.log += message + "\n";
    }

    public String displayLog() {
        return "Log:\n" + log;
    }
}

