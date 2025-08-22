package com.algopatterns.dsa.dto;
import java.util.List;

public class PrefixSumResponse {
    private List<Integer> result;

    public PrefixSumResponse() {}
    public PrefixSumResponse(List<Integer> result) {
        this.result = result;
    }

    public List<Integer> getResult() {
        return result;
    }
    public void setResult(List<Integer> result) {
        this.result = result;
    }
}
