package com.staszakharchenko.springbootforpnudevpreparation.controller;

import com.staszakharchenko.springbootforpnudevpreparation.dto.MyData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@ResponseBody + @Controller
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable ("name") String name) {
        return "Hello, " + name;
    }

    @GetMapping("/data")
    public MyData getData() {
        return MyData.builder()
                .content("my content")
                .build();
    }
}
