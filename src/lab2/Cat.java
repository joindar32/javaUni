package lab2;

class Cat extends Pet
{
    private int jumpHeight;
    public Cat(String name, int age, String color, int jumpHeight)
    {
        super(name, age, color);
        this.jumpHeight = jumpHeight;
    }
    public Cat()
    {
        super();
        this.jumpHeight = 2;
    }
    public int getJumpHeight()
    {
        return jumpHeight;
    }
    public void setJumpHeight(int val)
    {
        jumpHeight = val;
    }
    @Override
    public void getAllInfo()
    {
        super.getAllInfo();
        System.out.printf("Оно может прыгать на %s метра(ов) вверх.", this.getJumpHeight());
    }
    protected void makingSound()
    {
        System.out.print("\nЖивотное говорит: ");
        System.out.print("Муррр");
    }
    public void wantsFood()
    {
        super.wantsFood();
        System.out.print("Покормите его кошачим кормом.");
    }
}
