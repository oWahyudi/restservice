package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RestServiceApplicationTests {

    @Test
    void contextLoads() {
        RestServiceApplication.main(new String[]{});
        assertThat(true).isTrue();
    }

}
