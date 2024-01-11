package lab3;

public class Main {
    public static void main(String[] args) {
        HashTable<Integer, Student> hashTable = new HashTable<>();

        Student s1 = new Student("John", "Mays", 20, 5.0);
        hashTable.put(123456, s1);

        Student s2 = new Student("Ben", "Lin", 22, 4.2);
        hashTable.put(12345, s2);

        Student student = hashTable.get(123456);
        if (student != null) {
            System.out.println("Найденный студент: \n" + student + "\n");
        } else {
            System.out.println("Студент не найден. \n");
        }

        Student student2 = hashTable.get(12345);
        if (student != null) {
            System.out.println("Найденный студент: \n" + student2 + "\n");
        } else {
            System.out.println("Студент не найден. \n");
        }

        System.out.println("Перед удалением: \n" + hashTable + "Длина: " + hashTable.size() + "\n");

        hashTable.remove(12345);
        System.out.println("После удаления: \n" + hashTable + "Длина: " + hashTable.size() + "\n");
    }
}
