import javax.xml.namespace.QName;

public class Dog extends Animal
{
    Dog(int age) {super(age);}
    @Override
    void makeSound()
    {
        System.out.println("Sủa gì em");
    }
}
