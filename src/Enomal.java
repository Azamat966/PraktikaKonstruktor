public class Enomal {


    String name;
    int age;


    public Enomal(String name, int age) {
        this.name = name;
        this.age= age;
    }

    @Override
    public String toString() {
        return "" +
                "Аты жону " + name + '\'' +
                " Жашыы " + age ;
    }
}

