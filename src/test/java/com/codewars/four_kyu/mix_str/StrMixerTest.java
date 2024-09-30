package com.codewars.four_kyu.mix_str;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StrMixerTest {

    @Test
    public void test0() {
        System.out.println("Mix Fixed Tests");
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", StrMixer.mix("Are they here", "yes, they are here"));
    }
    @Test
    public void test1() {
        assertEquals("1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr",
                StrMixer.mix("A generation must confront the looming ", "codewarrs"));
    }
    @Test
    public void test2() {

        assertEquals("", StrMixer.mix("codewars", "codewars"));
    }
    @Test
    public void test3() {

        assertEquals("1:ee/1:ll/1:oo", StrMixer.mix("Lords of the Fallen", "gamekult"));
    }
    @Test
    public void test4(){
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", StrMixer.mix("Are they here", "yes, they are here"));
    }
    @Test
    public void test5(){
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg",
                StrMixer.mix("looping is fun but dangerous", "less dangerous than coding"));
    }

}