package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        ArrayList<Integer> data = BPSingleton.getInstance().getBPData();
        logger.info("Optimal base parameter: " + new FindBP().buildVectors(data));
    }
}
