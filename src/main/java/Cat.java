public class Cat extends Animal
{
    private static String name="Stormy";

    public Cat()
    {
        super(name);

    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void sounds()
    {
        System.out.println("Cat meows");
    }

}
