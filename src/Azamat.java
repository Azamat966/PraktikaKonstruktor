public class Azamat {
    String name;
    int age;

    public Azamat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "" +
                "Фамилия Имя " + name + '\'' +
                " Жашыы жону" + age;
    }
}
