package com.chaeum.lifemate.auth.controller;

import javax.validation.Valid;
import com.chaeum.lifemate.auth.dto.req.*;
import com.chaeum.lifemate.auth.service.AuthService;
import com.chaeum.lifemate.common.responsedto.CommonSuccessResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/lifemate/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;


    //jisu test
/*
    @PostMapping("/login")
    public ResponseEntity<?> login(HttpServletRequest request, @Valid @RequestBody LoginKaKaoReqDto dto) {

        return ResponseEntity.status(200).body(new CommonSuccessResponseDto("200", "로그인 성공", authService.login(dto.getCode());
    }
*/
    @PostMapping("/signUp")
    public ResponseEntity<?> signUp(@Valid @ModelAttribute SignUpReqDto dto) {
        return ResponseEntity.status(200).body(new CommonSuccessResponseDto("200", "회원가입 성공", authService.signUp(dto)));
    }
}
