package com.chaeum.lifemate.auth.service;

import com.chaeum.lifemate.auth.dto.req.SignUpReqDto;
import com.chaeum.lifemate.user.domain.User;
import com.chaeum.lifemate.user.mapper.UserMapper;
import com.chaeum.lifemate.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthService {

    // kakao 로그인 로직
    @Autowired
    UserMapper userMapper;

    public Object signUp(HashMap<String, Object> param) {
        userMapper.insertUser(param); // 1
        return null;
    }
}
