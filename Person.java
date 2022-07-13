import java.util.Date;

public class Person {
    String name;
   String birthDate;

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth Date='" + birthDate + '\'' +
                '}';
    }
}

