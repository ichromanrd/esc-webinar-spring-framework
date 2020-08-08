package encrypt.webinar.springboot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloBean bean;

    @GetMapping
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/without-bean")
    public String helloWithoutBean() {
        HelloBean helloBean = new HelloBean();
        helloBean.setName("Encrypt");
        helloBean.setInstagram("https://www.instagram.com/encryptsc/");

        return String.format(
            "Hello dari %s! Kunjungi instagram kami: %s",
            helloBean.getName(), helloBean.getInstagram());
    }

    @GetMapping("/with-bean")
    public String helloWithBean() {
        return String.format(
            "Bean: Hello dari %s! Kunjungi instagram kami: %s",
            bean.getName(), bean.getInstagram());
    }

}
