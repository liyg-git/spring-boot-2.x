package com.spring.diveinspringboot.repository;

import com.spring.diveinspringboot.annotation.FirstLevelRepository;
import org.springframework.stereotype.Component;

/**
 * @author 李永刚
 */
//@FirstLevelRepository(value = "myFirstLevelRepository")//Bean的名
@Component(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {
}
