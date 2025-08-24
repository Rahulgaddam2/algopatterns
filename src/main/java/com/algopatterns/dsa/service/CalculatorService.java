package com.algopatterns.dsa.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double compute(double num1, double num2, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return num1 + num2;
            case "sub":
                return num1 - num2;
            case "mul":
                return num1 * num2;
            case "div":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
