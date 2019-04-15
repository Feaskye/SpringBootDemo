package com.feaskye.kafkademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkademoApplication.class, args);

        //ProducerDemo.ProducerFun();
        //ConsumerDemo.ConsumerFun();

        try {
            ZookeeperDemo dm = new ZookeeperDemo();

            dm.createZKInstance();
            dm.ZKOperations();
            dm.ZKClose();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
