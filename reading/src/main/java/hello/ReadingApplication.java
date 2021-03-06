package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tioc
 * created on 2018/05/29
 * @apiNote 断路器
 */
@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class ReadingApplication {

    @Autowired
    private BookService bookService;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        // 在这里做任何额外的配置
        return builder.build();
    }

    @RequestMapping("/to-read")
    public String readingList(){
        return bookService.readingList();
    }


    public static void main(String[] args) {
        SpringApplication.run(ReadingApplication.class, args);
    }
}

