package nhn20230906;
public abstract class Person implements Comparable<Person> {
    private int no;
    private String name;
    private int age;

    public Person(int no,String name,int age){
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[no = " + no + ", name = " + name + ", age = " + age + "]";
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }   
     
}
