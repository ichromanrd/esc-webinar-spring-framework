package encrypt.webinar.springboot.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public HelloBean helloBean() {
        HelloBean helloBean = new HelloBean();
        helloBean.setName("Encrypt");
        helloBean.setInstagram("https://www.instagram.com/encryptsc/");
        return helloBean;
    }
}
