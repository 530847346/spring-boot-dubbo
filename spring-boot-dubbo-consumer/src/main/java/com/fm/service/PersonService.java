package com.fm.service;

import com.fm.api.PersonRpcService;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fm.dto.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    @Reference(version = "1.0.0")
    private PersonRpcService rpcService;

    public Person getPerson() {
        return rpcService.getPersonById("11");
    }
}
