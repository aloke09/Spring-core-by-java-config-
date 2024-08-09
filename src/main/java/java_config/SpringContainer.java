package java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainer
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        HelloWorld obj= (HelloWorld) context.getBean("helloWorld");
        obj.getMsg();
        context.close();
    }
}
