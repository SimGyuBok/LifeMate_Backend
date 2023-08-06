package com.chaeum.lifemate.paper.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Paper {
    String type;
    int receiverId;
    int senderId;
    int status;
    String title;
    String content;
    String reason;
    String date;
}
