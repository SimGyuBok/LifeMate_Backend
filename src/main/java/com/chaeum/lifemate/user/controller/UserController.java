package com.chaeum.lifemate.user.controller;

import com.chaeum.lifemate.common.responsedto.CommonSuccessResponseDto;
import com.chaeum.lifemate.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="findAll", method= RequestMethod.POST)
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(200).body(new CommonSuccessResponseDto("200", "findAll() 성공", userService.findAll()));
    }

}
