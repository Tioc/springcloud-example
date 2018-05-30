package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Tioc
 * created on 2018/05/30
 * @apiNote 负载均衡服务
 */
@RestController
@SpringBootApplication
public class SayHelloApplication {

    private static Logger logger = LoggerFactory.getLogger(SayHelloApplication.class);

    @RequestMapping("/greeting")
    public String greet(){
        logger.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random random = new Random();

        int randomNum = random.nextInt(greetings.size());
        return greetings.get(randomNum);
    }

    @RequestMapping("/")
    public String home(){
        logger.info("Access /");
        return "Hi!";
    }

    public static void main(String[] args){
        SpringApplication.run(SayHelloApplication.class, args);
    }
}
