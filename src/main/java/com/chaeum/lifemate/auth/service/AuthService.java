package com.chaeum.lifemate.auth.service;

import com.chaeum.lifemate.auth.dto.req.SignUpReqDto;
import com.chaeum.lifemate.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthService {

    // kakao 로그인 로직


    public Object signUp(SignUpReqDto dto) {

        return null;
    }
}
