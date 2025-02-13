package hikoyat;

public class Dog extends Animal{


    @Override
    public void sound() {
        System.out.println(name + " is barking");
    }

    @Override
    public void move() {
        System.out.println(name + " is faster than humam");
    }

}
