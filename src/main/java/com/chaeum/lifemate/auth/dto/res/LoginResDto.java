package com.chaeum.lifemate.auth.dto.res;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginResDto {

	private Integer creatorSeq;
	private String account;
	private Boolean banYn;
	private String creatorPhone;
	private String creatorTitle;
	private String creatorChannelLink;
	private String creatorCategory;
	private String referralCode;
	private String creatorAddress;
	private String creatorAddressDetail;
	

}
