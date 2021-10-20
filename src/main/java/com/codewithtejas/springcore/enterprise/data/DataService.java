package com.codewithtejas.springcore.enterprise.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> retrieveData() {
        return Arrays.asList(155, 156);
    }
}
