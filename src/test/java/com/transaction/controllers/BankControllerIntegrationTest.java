package com.transaction.controllers;

import com.transaction.MainApplicationClass;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplicationClass.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BankControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;


}