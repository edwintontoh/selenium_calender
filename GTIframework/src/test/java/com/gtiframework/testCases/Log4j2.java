package com.gtiframework.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

    private static final Logger log = LogManager.getLogger(Log4j2.class.getName()); //initiate logger and tell what class we want to get login

    public static void main(String[] args)
    {
        log.debug("test");

    }
}
