package pl.pjatk.DamKij;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(ApplicationContext applicationContext) {
        MyFirstComponent firstC = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent secondC = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
        firstC.helou();
        secondC.mesg();
    }
}
