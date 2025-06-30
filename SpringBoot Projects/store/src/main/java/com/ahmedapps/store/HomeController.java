package com.ahmedapps.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        String viewName=getViewName();
        return viewName;
    }
    private String getViewName(){
        return "index.html";
    }
}
