package com.algopatterns.dsa.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrefixSumService {
    public List<Integer> compute(List<Integer> nums) {
        List<Integer> pref = new ArrayList<>();
        int run = 0;
        for (int x : nums) {
            run += x;
            pref.add(run);
        }
        return pref;
    }
}
