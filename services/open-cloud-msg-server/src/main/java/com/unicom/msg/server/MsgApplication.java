package com.unicom.msg.server;

import com.unicom.msg.server.service.EmailConfigService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author liuyadu
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.unicom.msg.server.mapper")
public class MsgApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MsgApplication.class, args);
    }

    @Autowired
    private EmailConfigService emailConfigService;

    @Override
    public void run(String... strings) throws Exception {
        emailConfigService.loadCacheConfig();
    }
}
