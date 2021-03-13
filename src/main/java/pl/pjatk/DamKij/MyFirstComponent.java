package pl.pjatk.DamKij;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {
    public MyFirstComponent(ApplicationContext applicationContext) {
        System.out.println("Siemaneczko from MyFirstComponent");
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
    }

    public void helou() {
        System.out.println("Siemaneczko z helou");
    }
}
