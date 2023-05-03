package com.daniel.clusustask;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

@Slf4j
@SpringBootTest(classes = ClusustaskApplication.class)
@AutoConfigureMockMvc
class ClusustaskApplicationTests {

    @BeforeTestClass
    public static void contextLoads() {
        log.info("################################################################");
        log.info("========= Test started =================");
        log.info("################################################################");
    }

    @AfterTestClass
    void contextClosed() {
        log.info("################################################################");
        log.info("========= Test finished =================");
        log.info("################################################################");
    }

}
