package com.laborer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: Wangym
 * @Date: 2021/6/7 11:42
 * @Description:
 */
@SpringBootApplication
public class LaborerApplication {
    private final static Logger logger = LoggerFactory.getLogger(LaborerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LaborerApplication.class, args);
        logger.info(LaborerApplication.class.getSimpleName() + " is success!");
    }
}
