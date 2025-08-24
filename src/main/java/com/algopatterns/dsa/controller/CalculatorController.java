package com.algopatterns.dsa.controller;


import com.algopatterns.dsa.dto.CalculatorRequest;
import com.algopatterns.dsa.dto.CalculatorResponse;
import com.algopatterns.dsa.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @PostMapping("/cal")
    public CalculatorResponse calculate(@RequestBody CalculatorRequest req) {
        double result = service.compute(req.getNum1(), req.getNum2(), req.getOperation());
        return new CalculatorResponse(result);
    }

    // adding fake comment for testing
}
