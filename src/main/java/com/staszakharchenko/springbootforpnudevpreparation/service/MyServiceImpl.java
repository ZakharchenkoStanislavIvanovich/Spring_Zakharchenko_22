package com.staszakharchenko.springbootforpnudevpreparation.service;

import com.staszakharchenko.springbootforpnudevpreparation.dto.MyData;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{ // for business logic

    public MyData getData() {
        return MyData.builder()
                .content("my content")
                .build();
    }

}
