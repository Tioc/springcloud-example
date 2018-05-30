package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tioc
 * created on 2018/05/30
 * @apiNote 路由-过滤器
 */
@RestController
@SpringBootApplication
public class BookApplication {

    @RequestMapping("/available")
    public String available(){
        return "spring in action";
    }

    @RequestMapping("/checked-out")
    public String checkedOut(){
        return "spring boot in action";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}
