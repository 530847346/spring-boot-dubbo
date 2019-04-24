package com.fm.api;

import com.fm.dto.Person;

public interface PersonRpcService {

    Person getPersonById(String personId);
}
