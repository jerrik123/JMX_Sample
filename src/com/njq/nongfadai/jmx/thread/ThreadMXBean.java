package com.njq.nongfadai.jmx.thread;

/**
 * Copyright 2018/3/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.jmx.thread
 * @author: Jerrik
 * @date: 2018/3/15 10:23
 */
public interface ThreadMXBean {
    /**
     * 获取空闲线程的数量
     * @return
     */
    public Long getIdleThreadNum();
}
