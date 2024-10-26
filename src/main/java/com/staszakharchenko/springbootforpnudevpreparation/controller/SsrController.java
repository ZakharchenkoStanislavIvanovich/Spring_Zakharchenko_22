package com.staszakharchenko.springbootforpnudevpreparation.controller;

import com.staszakharchenko.springbootforpnudevpreparation.dto.MyData;
import com.staszakharchenko.springbootforpnudevpreparation.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SsrController { // for http request handling

    private MyService myService;

    @Autowired
    public SsrController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping // -> get info from server (html page)
    public String index(Model model) {

        MyData myData = myService.getData();

        model.addAttribute("data", myData);

        return "index";
    }

    @PostMapping // -> change information
    public String handlePost() {
        return "redirect:/"; //POST -> REDIRECT -> GET
    }

}
