package lab2;

abstract class Pet extends Animal
{
    private String name;
    public Pet(String name, int age, String color)
    {
        super(age, color);
        this.name = name;
    }
    public Pet()
    {
        super();
        this.name = "No name";
    }
    public String getName()
    {
        return name;
    }
    public void setName(String val)
    {
        this.name = val;
    }
    abstract protected void makingSound();
    public void wantsFood()
    {
        System.out.print("\nЖивотное хочет есть. ");
    }
    public void goToSleep(int time)
    {
        System.out.print("\n\nСейчас " + time + " часов. Питомец ложится спать.");
    }
    public void goToSleep(int time, boolean patted)
    {
        System.out.print("\n\nСейчас " + time + " часов. ");
        if(patted)
        {
            System.out.print("Питомец счастлив и может спать спокойно, ведь хозяин погладил его перед сном!");
            this.makingSound();
        }
        else
        {
            System.out.print("Питомец ложится спать грустный, потому что хозяин забыл погладить его.");
        }
    }
    public void meetAnotherPet(Pet pet)
    {
        System.out.print("\n" +this.getClass().getName() + " и " + pet.getClass().getName().toLowerCase() + " теперь друзья. ");
    }
    @Override
    public void getAllInfo()
    {
        System.out.printf("\nЖивотному %s год(а), а его окрас %s. ", this.getAge(), this.getColor().toLowerCase());
        System.out.printf("Его зовут %s. ", this.getName());
    }
}
