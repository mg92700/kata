package com.transaction.controllers;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.transaction.services.ServiceBankImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(BankController.class)
public class BankControllerTest {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    @Autowired
    ServiceBankImpl serviceBankMock;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void addSalarie() throws Exception {
       /* Salarie salarie = new Salarie("ilyes", "raissi", new BigDecimal(444444), "Tunis");
        given(salarieServiceMock.addsalarie(salarie)).willReturn(salarie);
        mockMvc.perform(post("/salaries")
                .contentType(APPLICATION_JSON)
                .accept(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(salarie)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nom").value("ilyes"))
                .andExpect(jsonPath("$.prenom").value("raissi"))
                .andExpect(jsonPath("$.salaire").value(444444))
                .andExpect(jsonPath("$.adresse").value("Tunis"));
        verify(salarieServiceMock, times(1)).addsalarie(salarie);
        verifyNoMoreInteractions(salarieServiceMock);*/
    }





}