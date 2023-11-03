package com.sbs.academy.Java;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Member {

    private String userId;
    private String password;
    private String userName;

    public Member() {
        super();
    }

    //all
//    public Member(String userId, String password, String userName) {
//        super();
//        this.userId = userId;
//        this.password = password;
//        this.userName = userName;
//    }


}
