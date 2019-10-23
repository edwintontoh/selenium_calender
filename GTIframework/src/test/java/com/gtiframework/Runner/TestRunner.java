package com.gtiframework.Runner;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String args[])
    {
        TestNG runner = new TestNG();

        List<String> list = new ArrayList<String>();
        list.add("/Users/ed/automation/GTIframework/test-output/Sprint1/testng-failed.xml");
        runner.setTestSuites(list);
        runner.run();

    }

}
