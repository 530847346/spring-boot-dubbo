package com.fm.rpc.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fm.api.PersonRpcService;
import com.fm.dto.Person;
@Service(version = "1.0.0")
public class PersonRpcServiceImpl implements PersonRpcService {
    @Override
    public Person getPersonById(String personId) {
        return new Person("张山",100,"M");
    }
}
