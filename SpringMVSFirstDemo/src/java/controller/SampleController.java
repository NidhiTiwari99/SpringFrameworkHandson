package controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
    
    @RequestMapping("sample")
    public ModelAndView sampleview(){
        ModelAndView m = new ModelAndView("demofolder/index");
                return m;
    }
       @RequestMapping("customer")
       public ModelAndView custview(){
           ModelAndView n = new ModelAndView("demofolder/customer");
           n.addObject("Customer_id",100);
            n.addObject("Customer_name","Nidhi");
            List<String> lst = new ArrayList<>();
            lst.add("Pune");
            lst.add("Mumbai");
            lst.add("Nashik");
            lst.add("Nagpur");
            lst.add("Indore");
            n.addObject("cities", lst);
           return n;
       }
}
