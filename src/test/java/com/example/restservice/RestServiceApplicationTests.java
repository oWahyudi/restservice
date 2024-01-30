package com.example.restservice;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RestServiceApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Order(1)
    void contextLoads() {
        RestServiceApplication.main(new String[]{});
        assertThat(true).isTrue();
    }

    @Test
    @Order(2)
    void testGetEndpoint_employees() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/employees"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$..Employees[*].employee_id").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$..Employees[*].first_name").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$..Employees[*].last_name").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$..Employees[*].email").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$..Employees[*].title").isArray());


    }

}
