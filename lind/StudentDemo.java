package lind;
public class StudentDemo {
    public  void print() {
       
        Student s1 = new Student("zhangsan", 28);
        Student s2 = new Student("lisi", 31);
        Student s3 = new Student("wanger", 18);
        Student[] students=new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int x = 0; x < students.length; x++) {
            Student s = students[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}