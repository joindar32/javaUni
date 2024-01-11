package lab2;

public class Main
{
    public static void main(String[] args)
    {
        // создаем животных, используя конструкторы по умолчанию
        Pet someCat= new Cat();
        Pet someFish = new Fish();
        Pet someParrot = new Parrot();

        // создаем животных, вводя свои параметры
        Pet cat = new Cat("Снежок", 4, "Белый",3);
        Pet fish = new Fish("Немо", 1, "Золотой",5);
        Pet parrot = new Parrot("Кеша", 3, "Зеленый",true);

        // получаем всю информацию о животных
        someCat.getAllInfo();
        cat.getAllInfo();
        fish.getAllInfo();
        parrot.getAllInfo();

        // животные ложатся спать
        fish.goToSleep(6);
        parrot.goToSleep(8,true);
        cat.goToSleep(10, false);

        System.out.print("\n");
        cat.meetAnotherPet(fish); // встреча с другим животным

        System.out.print("\n");
        parrot.wantsFood(); // животное хочет есть

        System.out.printf("\n\nВсего %s домашних животных.", Pet.getNumberOfPets()); // число животных
    }
}