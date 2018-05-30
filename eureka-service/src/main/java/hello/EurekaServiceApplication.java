package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Tioc
 * created on 2018/05/29
 * @apiNote 服务注册发现
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
