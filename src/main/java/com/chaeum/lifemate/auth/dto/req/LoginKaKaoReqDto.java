package com.chaeum.lifemate.auth.dto.req;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class LoginKaKaoReqDto {

    @NotNull(message = "코드를 입력해주세요")
    private String code;

}
