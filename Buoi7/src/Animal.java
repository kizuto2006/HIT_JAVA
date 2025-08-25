public class Animal
{
    private int age;

    public abstract void eat();
    public void sleep();
    void tt()
    {
        System.out.println("Age: "+ age);
    }
    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
