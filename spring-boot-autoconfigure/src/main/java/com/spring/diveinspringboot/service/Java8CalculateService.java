package com.spring.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Java 8 for 循环实现
 * @author 李永刚
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService{

    @Override
    public Integer sum(Integer... values) {
        int sum = Stream.of(values).reduce(0,Integer::sum);
        return sum;
    }

    public static void maim(String[] args){
        Java8CalculateService calculateService = new Java8CalculateService();
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
