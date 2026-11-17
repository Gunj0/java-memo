import java.util.ArrayList;

public class Object {
    public static void main(String[] args){
        // オブジェクト
        // Bean (JavaBeans) とも呼ばれる
        Person p = new Person("John", 30);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        // ArrayList
        ArrayList<Person> people = new ArrayList<>();
        people.add(p);
        System.out.println(people.get(0).getName());
        System.out.println(people.get(0).getAge());

        for (Person person : people) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }
}

class Person {
    // プロパティ (フィールド)
    private String name;
    private int age;

    // getter (アクセサメソッド)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // コンストラクタ
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
