package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class TestSpring {

    private static final Logger log = Logger.getLogger(TestSpring.class.getName());

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean = context.getBean("testBean", TestBean.class);
        log.info(testBean.getName());
    }

}
