package com.test.taskTau.controller;

import com.test.taskTau.service.BillsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bills")
public class BillsController {

    private final BillsService service;

    @GetMapping()
    public int getMinimumCoins(@RequestParam BigDecimal billsAmount) throws Exception {
        return service.findMiniumCoins(billsAmount);
    }
}