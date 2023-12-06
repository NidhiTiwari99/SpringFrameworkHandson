
package springframeworkdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Student;

public class SpringFrameworkDemo {

   
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Student st = (Student) context.getBean("st");
        System.out.println("Roll Number="+st.getRno());
        System.out.println("Student Name="+st.getName());
        }
    
}
