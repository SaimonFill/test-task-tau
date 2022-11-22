package com.test.taskTau.controller;

import com.test.taskTau.enums.QuantityCoinsEnum;
import com.test.taskTau.service.CoinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coins")
public class CoinsController {

    @Autowired
    private CoinsService service;

    @PutMapping()
    public void changeNumberOfCoins(@RequestParam QuantityCoinsEnum coinsEnum, @RequestParam int newQuantiy) {
        service.changeNumberOfCoins(coinsEnum, newQuantiy);
    }
}
