package webdriver;


public abstract class BaseEntity {

    protected static Logger logger = Logger.getInstance();

    public static void logStep(final int step) {
        logger.step(step);
    }

    public static void logStep(final int step, String message) {
        logStep(step);
        logger.info(String.format("------< %1$s >------", message));
    }

}
