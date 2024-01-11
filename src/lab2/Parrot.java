package lab2;

class Parrot extends Pet
{
    private boolean abilityToSpeak;
    public Parrot(String name, int age, String color, boolean abilityToSpeak)
    {
        super(name, age, color);
        this.abilityToSpeak = abilityToSpeak;
    }
    public Parrot()
    {
        super();
        this.abilityToSpeak = false;
    }
    public boolean getAbilityToSpeak()
    {
        return abilityToSpeak;
    }
    public void setAbilityToSpeak(boolean val)
    {
        abilityToSpeak = val;
    }
    @Override
    public void getAllInfo()
    {
        super.getAllInfo();
        if(this.getAbilityToSpeak())
        {
            System.out.print("Оно может повторять слова за человеком.");
        }
    }
    protected void makingSound()
    {
        System.out.print("\nЖивотное говорит: ");
        System.out.println("Спокойной ночи");
    }
    public void wantsFood()
    {
        super.wantsFood();
        System.out.print("Покормите его зерном.");
    }
}
