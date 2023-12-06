package controller;
import model.Student;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    
    @RequestMapping("student")
    public ModelAndView studentview(){
        List<Student>lst = new ArrayList<>();
        lst.add(new Student (1,"Nidhi","BE",96));
                lst.add(new Student (1,"Nidhi","BE",96));
                lst.add(new Student (2,"Vidhi","BSC",91));
                lst.add(new Student (3,"Sonam","BCOM",80));
                lst.add(new Student (4,"Shivam","MCOM",82));
                lst.add(new Student (5,"Piyush","ME",89));
                ModelAndView m = new ModelAndView("student/index");
                m.addObject("students", lst);
                return m;
    }
}
