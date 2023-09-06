package nhn20230906;

public class Test {
    public static void main(String[] args) {
        Department<Student> department = new Department<>(1, "Computer Engineering");
        department.add(new Student(1, "Celine", 21));
        department.add(new Student(3, "Jason", 19));
        department.add(new Student(2, "James", 20));
        department.add(new Student(4, "Rogers", 22));
        
        // 기존
        //Collections.sort(department.getList());
        
        // 1. Comparator의 subType class
        //Collections.sort(department.getList(),new Compare());
        // 2. ananymous class
        // Collections.sort(department.getList(), new Compare(){
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return o1.getAge() - o2.getAge();
        //     }
        // });

        // 3. 람다       
        // Collections.sort(department.getList(), (x,y) -> x.getAge() - y.getAge());

        // department.sort();
        // department.sort(new Compare(){
        //     @Override
        //     public int compare(Person o1, Person o2) {
        //         return o1.getNo() - o2.getNo();
        //     }
        // });

        department.sort(new Compare());
        printStudentInformation(department);
    }

    public static void printStudentInformation(Department<Student> department) {
        for (Student s : department) {
            System.out.println(s);
        }
    }
}
