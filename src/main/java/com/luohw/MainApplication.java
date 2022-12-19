package com.luohw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableEurekaServer
@SpringBootApplication
public class MainApplication {

    public static void main( String[] args ) {
        SpringApplication.run(MainApplication.class,args);

        System.out.println("------start success-----");
    }
}
