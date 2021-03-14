package webdriver;

import io.qameta.allure.Step;

public class Logger {

    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logger.class);
    private static Logger instance = null;
    private static boolean logSteps = true;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private void logFormatMessage(String message) {
        if (logSteps) {
            info(String.format("----------< %1$s >----------", message));
        }
    }

    @Step("{message}")
    public void info(String message) {
        logger.info(message);
    }

    public void step(int step) {
        logFormatMessage("step " + String.valueOf(step));
    }

}
