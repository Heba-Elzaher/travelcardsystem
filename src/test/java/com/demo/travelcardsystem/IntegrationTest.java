package com.demo.travelcardsystem;

import com.demo.travelcardsystem.config.TravelcardsystemApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TravelcardsystemApplication.class})
@AutoConfigureMockMvc
public abstract class IntegrationTest {
}
