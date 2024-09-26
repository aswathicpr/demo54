package com.example.first_spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
        @RequestMapping("hi")
public class HelloController {
    @GetMapping("hello")
    public void getdetails() {
        System.out.println("Hello Welcome to the world of leaning :");
        //   return "good morning";
    }

}
/*@RestController
public class HelloController {
    @GetMapping("/get")
    public String helloControllerMethod(){
        return "Hello Good Morning";
    }
}
*/