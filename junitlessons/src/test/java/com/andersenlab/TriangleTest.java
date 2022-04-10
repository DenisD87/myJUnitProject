package com.andersenlab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void test1() {
        logger.info("Start test 1");
        Assertions.assertEquals(0.0, Triangle.getArea(1, 2, 3));
        logger.info("Stop test 1");
    }

    @Test
    public void test2() {
        logger.info("Start test 2");
        Assertions.assertEquals(1.7320508075688772, Triangle.getArea(2, 2, 2));
        logger.info("Stop test 2");
    }

    @Test
    public void test3() {
        logger.info("Start test 3");
        Assertions.assertEquals(2.8284271247461903, Triangle.getArea(3, 2, 3));
        logger.info("Stop test 3");
    }
}
