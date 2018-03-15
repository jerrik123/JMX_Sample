package com.njq.nongfadai.jmx.calc;

/**
 * Copyright 2018/3/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.jmx
 * @author: Jerrik
 * @date: 2018/3/15 10:15
 */
public class CalcBean implements CalcMXBean {
    @Override
    public Integer eval(String script) {
        System.out.println("eval--> " + script);
        return 3;
    }
}
