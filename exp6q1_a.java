class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
interface Pet {
    void play();
}
interface Wild {
    void hunt();
}
class Dog extends Animal implements Pet, Wild {
    public void play() {
        System.out.println("Dog is playing");
    }

    public void hunt() {
        System.out.println("Dog is hunting");
    }
}
public class exp6q1_a {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal,24csu324");
        Dog d = new Dog();
        d.eat();
        d.play();
        d.hunt();
    }
}