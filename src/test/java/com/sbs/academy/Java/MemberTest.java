package com.sbs.academy.Java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    public void testToString() {
        Member member = new Member("abc", "1234","PARK");
        System.out.println(member);
    }

}