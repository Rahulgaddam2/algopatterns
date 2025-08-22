package com.algopatterns.dsa.controller;

import com.algopatterns.dsa.dto.PrefixSumRequest;
import com.algopatterns.dsa.dto.PrefixSumResponse;
import com.algopatterns.dsa.service.PrefixSumService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prefix")
public class PrefixSumController {
    private final PrefixSumService service;

    public PrefixSumController(PrefixSumService service) {
        this.service = service;
    }

    @PostMapping("/sum")
    public PrefixSumResponse getPrefixSum(@RequestBody PrefixSumRequest req) {
        return new PrefixSumResponse(service.compute(req.getNums()));
    }
}
