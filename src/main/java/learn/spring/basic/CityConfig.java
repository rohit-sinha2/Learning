package learn.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityConfig
{
    @Bean
    public City getCity(@Autowired State state, @Value("${city.name}") String cityname )
    {
        City city =new City();
        city.setId(1);
        city.setName(cityname);
        city.setState(state);
        return city;
    }

    @Bean
    public State getState()
    {
        State state = new State();
        state.setName("UP");
        return state;
    }
}
