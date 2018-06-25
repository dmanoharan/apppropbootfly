package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloWildFlyController {

@Value("${app.team}")
        private String appTeam;
    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly"+appTeam);
    }
}
