package lab2;

abstract class Animal
{
    private int age;
    private String color;
    private static int counter;
    public Animal(int age, String color)
    {
        this.age = age;
        this.color = color;
        counter++;
    }
    public Animal()
    {
        age = 1;
        color = "Черный";
        counter++;
    }
    public int getAge()
    {
        return age;
    }
    public String getColor()
    {
        return color;
    }
    public static int getNumberOfPets()
    {
        return counter;
    }
    public void setAge(int val)
    {
        age = val;
    }
    public void setColor(String val)
    {
        color = val;
    }
    abstract public void getAllInfo();
}
