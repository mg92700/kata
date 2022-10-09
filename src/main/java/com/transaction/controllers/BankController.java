package com.transaction.controllers;

import com.transaction.services.ServiceBank;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Bank")
@Api(value = "gestion des salariés", description = "Operations pour la gestion des salariés")
public class BankController {

    private Logger logger = LoggerFactory.getLogger(BankController.class);
    private final ServiceBank serviceBank;

    public BankController(ServiceBank serviceBank) {
        this.serviceBank = serviceBank;
    }


}