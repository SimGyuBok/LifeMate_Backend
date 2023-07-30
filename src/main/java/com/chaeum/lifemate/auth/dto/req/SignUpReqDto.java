package com.chaeum.lifemate.auth.dto.req;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class SignUpReqDto {

    @NotNull(message = "이메일을 입력해주세요")
    private String account;

    @NotNull(message = "비밀번호를 입력해주세요")
    private String password;
    
    @NotNull(message = "핸드폰번호를 입력해주세")
    private String creatorPhone;
    
    private String referralCode;

//    @NotNull(message = "주소를 입력해주세요")
    private String creatorAddress;
    
//    @NotNull(message = "주소를 입력해 주세요")
    private String creatorAddressDetail;
    
    @NotNull(message = "카테고리를 입력해 주세요")
    private String creatorCategory;
    
//    @NotNull(message = "채널링크를 입력해 주세요")
    private String creatorChannelLink;
    
//    @NotNull(message = "채널명을 입력해 주세요")
    private String creatorTitle;
    
    private String expoToken;
    
    @NotNull(message = "채널 카테고리를 선택해주세요")
    private String channelCategory;
    
//    @NotNull(message = "구독자수를 입력해주세요")
    private Integer subscribers;
    
//    @NotNull(message = "이미지를 선택해 주세요")
//    private MultipartFile image;

    @NotNull(message = "마켓팅 활동 동의를 선택해주세요")
    private Boolean marketingYn;

//    @NotNull(message = "최소 광고 단가를 입력해 주세요")
//    private Integer minAdvPrice;
//
//    @NotNull(message = "광고 단가를 입력해 주세요")
//    private Integer advPrice;

    private Boolean pushYn;

    // 회원가입시 인증할 플랫폼 무엇인지
    private String whatPlatformVerify;

    private String fcmToken;
}
