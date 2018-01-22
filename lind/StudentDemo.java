package lind;
/*
 * 需求：请定义一个数组，存储三个学生对象，然后遍历该数组，得到每一个学生对象的成员变量值。
 * 
 * Student[]	对象数组。
 */
public class StudentDemo {
    public  void print() {
        Student[] students = new Student[3];

        for (int x = 0; x < students.length; x++) {
            System.out.println(students[x]);
        }

        Student s1 = new Student("zhangsan", 28);
        Student s2 = new Student("lisi", 31);
        Student s3 = new Student("wanger", 18);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int x = 0; x < students.length; x++) {
            Student s = students[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}