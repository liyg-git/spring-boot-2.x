package com.spring.diveinspringboot.service;

/**
 * 计算服务
 * @author 李永刚
 */
public interface CalculateService {
    /***
     * 从多个整数sum 求和
     * @param values 多个整数
     * @return sum 累加值
     */
    Integer sum(Integer... values);
}
