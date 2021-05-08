package pl.pjatk.DamKij;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SecondClass {
    @Value("${my.custom.property}")
    private String fromValue;

    @Bean
    public SimplePOJO mySimplePojo() {
        System.out.println(fromValue);
        return new SimplePOJO("Moja pierwsza nazwa", 10);
    }

    @Bean
    public List<String> defaultData() {
        return List.of("1","2","3","4","5");
    }


}
