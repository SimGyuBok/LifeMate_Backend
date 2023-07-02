package com.chaeum.lifemate.service;

import org.springframework.stereotype.Service;

@Service
public class PaperService {
    public String myName(String name) {
        if (name != null) {
            return "my name is " + name;
        } else {
            return "name param is null";
        }
    }
}
