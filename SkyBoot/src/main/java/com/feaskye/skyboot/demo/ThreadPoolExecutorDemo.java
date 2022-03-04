package com.feaskye.skyboot.demo;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {



    /* 线程池的几个参数：
    * int corePoolSize 核心线程数，最小同时运行的线程数
    * int maximumPoolSize 可同时运行的最大线程数
    *
    * workQueue 等待运行的任务队列
    *
    * int keepAliveTime 超过核心线程数corePoolSize的线程等待销毁的时间
    * unit 时间单位
    *
    * ThreadFactory 线程工厂用来创建新线程
    *
    * handler 策略，当线程池和队列都满了的拒绝策略，饱和策略
    *
    * */
    public void test(){
//        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor();


    }





}



public class MyThreadFactory implements ThreadFactory {
    private final String poolName;

    public MyThreadFactory(String poolName) {
        this.poolName = poolName;
    }

    public Thread newThread(Runnable runnable) {
        return new MyAppThread(runnable, poolName);//将线程池名字传递给构造函数，用于区分不同线程池的线程
    }


}


 class MyAppThread{
    MyAppThread(Runnable runnable,String poolName){

    }

}