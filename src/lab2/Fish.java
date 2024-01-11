package lab2;

class Fish extends Pet
{
    private int swimmingSpeed;
    public Fish(String name, int age, String color, int swimmingSpeed)
    {
        super(name, age, color);
        this.swimmingSpeed = swimmingSpeed;
    }
    public Fish()
    {
        super();
        this.swimmingSpeed = 5;
    }
    public int getSwimmingSpeed()
    {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(int val)
    {
        swimmingSpeed = val;
    }
    @Override
    public void getAllInfo()
    {
        super.getAllInfo();
        System.out.printf("Оно плавает со скоростью %s км/ч.", this.getSwimmingSpeed());
    }
    protected void makingSound()
    {
        System.out.print("\nЖивотное говорит: ");
        System.out.println("...");
    }
    public void wantsFood()
    {
        super.wantsFood();
        System.out.print("Покормите его кормом для рыб.");
    }
}
