import java.util.ArrayList;
public class MainProgram
{
    public static void main(String[] args)
    {

        /*Dog dog = new Dog();
        dog.eat();   // -> 'Rax eats'
        dog.sounds(); // -> 'Dog barks'
        Cat cat = new Cat();
        cat.eat();   // -> 'Stormy eats'
        cat.sounds(); // -> 'Cat meows'*/
        //ArrayList<Animal> list = new ArrayList<>();

        // Java

        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        home.makeAllSounds();
        home.adoptPet(dog1);
        home.makeAllSounds();

        home.adoptPet(cat);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}