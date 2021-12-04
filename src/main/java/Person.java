import lombok.Getter;

@Getter
public class Person {
    private String first;
    private String city;
    private int age;

    Person(String first, String city, int age) {
        this.first = first;
        this.city = city;
        this.age = age;
    }
}
