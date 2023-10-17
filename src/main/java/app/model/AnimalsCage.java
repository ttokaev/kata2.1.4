package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animal;
    private final Timer timer;

    public AnimalsCage(@Autowired Dog dog, @Autowired Timer timer) {
        this.animal = dog;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    @Autowired
    public Timer getTimer() {
        return timer;
    }
}
