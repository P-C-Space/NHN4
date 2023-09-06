package nhn20230906;

public class Student extends Person  {
    public Student(int studentNo,String name, int age){
        super(studentNo, name, age);
    }


    // public int getStudentNo() {
    //     return studentNo;
    // }
    // public String getName() {
    //     return name;
    // }
    // public int getAge() {
    //     return age;
    // }
    // public void setStudentNo(int studentNo) {
    //     this.studentNo = studentNo;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }

    // @Override
    // public String toString(){
    //     return this.studentNo + ", " + this.name + ", "+ this.age;
    // }


    // @Override
    // public int compareTo(Student s) {
    //     if(this.studentNo == s.studentNo) {
    //         return 0;
    //     }
    //     else if(this.studentNo < s.studentNo){
    //         return -1;
    //     }
    //     return 1;

    // }

}
