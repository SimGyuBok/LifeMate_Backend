package com.chaeum.lifemate.common.responsedto;

import lombok.Getter;

@Getter
public class CommonFailResponseDto {

    private Boolean result = false;
    private String code;
    private String message;

    private Object data;

    public CommonFailResponseDto(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
