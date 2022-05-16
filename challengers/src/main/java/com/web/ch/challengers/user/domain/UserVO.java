package com.web.ch.challengers.user.domain;

import lombok.Data;

import java.util.Date;
@Data

public class UserVO {
    private int userId;
    private String email;
    private String nickname;
    private String password;
    private String phoneNumber;
    private Date userCreated;
    private Date userUpdated;
    private String userStatus;
    private String userLevel;
}
