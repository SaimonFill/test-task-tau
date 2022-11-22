package com.test.taskTau.controller;

import com.test.taskTau.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/bills")
public class BillsController {

    @Autowired
    private BillsService service;

    @GetMapping(value = "/{bills}")
    public int getMinimumCoins(@PathVariable BigDecimal bills) throws Exception {
        return service.findMiniumCoins(bills);
    }
}
