package com.njq.nongfadai.jmx.calc;

import com.njq.nongfadai.jmx.calc.CalcBean;
import com.njq.nongfadai.jmx.calc.CalcMXBean;

import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Copyright 2018/3/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.jmx
 * @author: Jerrik
 * @date: 2018/3/15 10:14
 */
public class FirstJMXSample {
    public static void main(String[] args) throws Exception {
        ObjectName objName = new ObjectName("com.njq.nongfadai.jmx.calc:name=calcBean");

        CalcMXBean calcBean = new CalcBean();
        ManagementFactory.getPlatformMBeanServer().registerMBean(calcBean,objName);

        System.in.read();
    }
}
