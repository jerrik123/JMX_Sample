package com.njq.nongfadai.jmx.thread;

import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Copyright 2018/3/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.jmx.thread
 * @author: Jerrik
 * @date: 2018/3/15 10:25
 */
public class ThreadJMXSample {
    public static void main(String[] args) throws Exception {
        ThreadMXBean threadMXBean = new ThreadBean();
        ObjectName ObjectName = new ObjectName("com.njq.nongfadai.jmx.thread:name=threadBean");
        ManagementFactory.getPlatformMBeanServer().registerMBean(new ThreadBean(), ObjectName);

        System.in.read();
    }
}
