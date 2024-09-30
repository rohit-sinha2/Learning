package learn.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
    @Autowired
    public City city;
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);

       // City cty = context.getBean("city", City.class);
       // cty.setId(01);
      //  cty.setName("Varanasi");
      //  State st = context.getBean("state", State.class);
       // st.setName("UP");
      //  cty.setState(st);
       // cty.showCityDetails();

    }

    @Override
    public void run(String... args) throws Exception
    {

        city.showCityDetails();
    }
}
