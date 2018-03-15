package com.njq.nongfadai.jmx.calc;

/**
 * Copyright 2018/3/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.jmx
 * @author: Jerrik
 * @date: 2018/3/15 10:15
 */
public interface CalcMXBean {
    Integer eval(String script);
}
