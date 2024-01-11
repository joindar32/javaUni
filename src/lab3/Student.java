package lab3;

class Student {
    String name;
    String surname;
    int age;
    double averageGrade;

    Student() {
        this.name = null;
        this.surname = null;
        this.age = 0;
        this.averageGrade = 0;
    }
    Student(String name, String surname, int age, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "{Имя: " + this.getName() + ", Фамилия: " + this.getSurname() + ", " +
                "Возраст: " + this.getName() + ", Средний балл: " + this.getAverageGrade() + "}";
    }
}
