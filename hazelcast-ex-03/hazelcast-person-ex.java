import java.io.Serializable;

public class Person implements Serializable {
    private String name;

    // Parametresiz constructor (serileştirme için gerekli)
    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
