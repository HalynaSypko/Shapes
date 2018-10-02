public class Person {
    private int age;
    private String name1;

    public Person(int age, String name1) {
        this.setAge(age);
        this.setName1(name1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}
