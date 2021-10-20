package com.codewithtejas.springcore.enterprise.business;

import com.codewithtejas.springcore.enterprise.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
    @Autowired
    private DataService ds;

    public int calculate() {
        var data = ds.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}
