package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("==============================");
        logger.info("Java Gradle Application");
        logger.info("==============================");

        logger.info("Application Status : Running");
        logger.info("Build Tool         : Gradle");
        logger.info("Java Version       : 21");
        logger.info("Environment        : Development");
        logger.info("CI/CD Integration  : Jenkins");

        logger.info("==============================");
        logger.info("Build Completed Successfully");
        logger.info("==============================");
    }

    public String getGreeting() {
        return "Hello World!";
    }
}