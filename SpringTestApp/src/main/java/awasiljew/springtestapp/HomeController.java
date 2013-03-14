package awasiljew.springtestapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author adam
 */
@Controller
public class HomeController {
 
    @RequestMapping(value = "/sp") 
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "home";
    }
    
}
