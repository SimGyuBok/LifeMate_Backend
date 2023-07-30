package com.chaeum.lifemate.auth.dto.req;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class ReferralCodeReqDto {

    @NotNull(message = "레퍼럴 코드를 입력해 주세요.")
    private String referralCode;
}
