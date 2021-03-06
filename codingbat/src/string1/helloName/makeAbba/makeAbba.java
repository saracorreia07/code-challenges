package string1.helloName.makeAbba;

public class makeAbba {

    /*
    CHALLENGE
    Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */

    public static void main(String[] args) {

        makeAbba("Hi", "Bye"); //"HiByeByeHi"
        makeAbba("Yo", "Alice"); //"YoAliceAliceYo"
        makeAbba("What", "Up"); //"WhatUpUpWhat"
    }

    public static String makeAbba(String a, String b) {

        return a + b + b + a;
    }

}
