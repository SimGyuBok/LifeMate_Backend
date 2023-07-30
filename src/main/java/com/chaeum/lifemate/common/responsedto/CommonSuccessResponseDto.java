package com.chaeum.lifemate.common.responsedto;

import lombok.Getter;

@Getter
public class CommonSuccessResponseDto {

    private Boolean result = true;
    private String code;
    private String message;

    private Object data;

    public CommonSuccessResponseDto(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
