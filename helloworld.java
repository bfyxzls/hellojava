import lind.IAuto;
import lind.Auto;
import lind.Student;
import lind.StudentDemo;
public class helloworld {
     public static void main(String[]agrs) {
       System.out.println("HelloWorld!"); 

       IAuto auto1 = new Auto(); 
       auto1.printMsg("123"); 
       new StudentDemo().print();
     }
    }
