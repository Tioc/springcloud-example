package hello;

import hello.filter.pre.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author Tioc
 * created on 2018/05/30
 * @apiNote 路由-过滤器
 */
@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

    @Bean
    public SimpleFilter simpleFilter(){
        return new SimpleFilter();
    }

    public static void main(String[] args){
        SpringApplication.run(GatewayApplication.class, args);
    }

}
