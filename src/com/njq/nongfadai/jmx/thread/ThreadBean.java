package com.njq.nongfadai.jmx.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Copyright 2018/3/15 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai.jmx.thread
 * @author: Jerrik
 * @date: 2018/3/15 10:24
 */
public class ThreadBean implements ThreadMXBean {
    private ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, Integer.MAX_VALUE,
            30L, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>());

    public ThreadBean() {
        for(int i=0;i<5;i++){
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override
    public Long getIdleThreadNum() {
        System.out.println();
        System.out.println();
        System.out.println("当前线程情况: ");
        System.out.println("getActiveCount: " + threadPoolExecutor.getActiveCount());
        System.out.println("getCompletedTaskCount: " + threadPoolExecutor.getCompletedTaskCount());
        System.out.println("getCorePoolSize: " + threadPoolExecutor.getCorePoolSize());
        System.out.println("getLargestPoolSize: " + threadPoolExecutor.getLargestPoolSize());
        System.out.println("getPoolSize: " + threadPoolExecutor.getPoolSize());
        System.out.println("getTaskCount: " + threadPoolExecutor.getTaskCount());
        return threadPoolExecutor.getTaskCount();
    }
}
