package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")  
    public ModelAndView helloWorld(HttpServletRequest request,HttpServletResponse res) {  
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(name.equals("admin") && password.equals("admin")){  
        String message = "Welcome "+name +"!!! to the world of Continuous Integration with Jenkins, ANT, SVN! Enjoy!";  
        return new ModelAndView("hellopage", "message", message);  
        }  
        else{  
            return new ModelAndView("errorpage", "message","Sorry, username or password error");  
        }  
    }  
}
