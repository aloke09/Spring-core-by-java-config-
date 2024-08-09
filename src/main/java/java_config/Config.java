package java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    @Bean
    public HelloWorld helloWorld()
    {
        HelloWorld helloWorld=new HelloWorld();
        helloWorld.setMsg("Hello every-one this is an example of java config");
        return helloWorld;
    }
}
