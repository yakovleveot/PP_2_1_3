import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld nextBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        System.out.println(bean.equals(nextBean));

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        Cat nextCat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

        System.out.println(cat.equals(nextCat));
    }
}