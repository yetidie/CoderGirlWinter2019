package org.launchcode.hellospringboot.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request){

        String name = request.getParameter("name");
        if(name == null){
            name = "person";
        }
        return "Hello " + name;
    }
    @RequestMapping(value= "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm(){
        String html="form method='post'>"+
                "<input type='text' name='name' />" +
                "input type='submit' value='Greet me!' />" +
                "</form>";
        return html;
    }
    @RequestMapping(value= "hello", method = RequestMethod.POST)
    @ResponseBody

    public String helloPost(HttpServletRequest request){
        String name = request.getParameter("name");
        return name;
    }


    @RequestMapping(value="goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye";
    }
}
