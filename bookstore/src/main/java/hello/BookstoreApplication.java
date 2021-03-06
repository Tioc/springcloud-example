package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tioc
 * created on 2018/05/29
 * @apiNote 断路器
 */
@RestController
@SpringBootApplication
public class BookstoreApplication {

    @RequestMapping("recommended")
    public String readingList(){
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }
}
