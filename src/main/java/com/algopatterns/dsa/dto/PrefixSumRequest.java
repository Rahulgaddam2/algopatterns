package com.algopatterns.dsa.dto;

import java.util.List;

public class PrefixSumRequest {
    private List<Integer> nums;

    public PrefixSumRequest() {}
    public PrefixSumRequest(List<Integer> nums) { this.nums = nums; }

    public List<Integer> getNums() { return nums; }
    public void setNums(List<Integer> nums) { this.nums = nums; }
}
