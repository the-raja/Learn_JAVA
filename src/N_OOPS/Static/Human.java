package N_OOPS.Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long Population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.Population += 1;
    }

}
