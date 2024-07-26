package springsecurity.springsecurity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
 class controller {
 
    @GetMapping("hello")
     String control(){
        return "hello spring security";
     }
    
}
