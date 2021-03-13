package pl.pjatk.DamKij;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
    public MySecondComponent() {
        System.out.println("Siemaneczko from MySecondComponent");
    }

    public void mesg(){
        System.out.println("Elooooooooooo");
    }


}
