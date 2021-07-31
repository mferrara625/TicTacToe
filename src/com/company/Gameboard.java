package com.company;

public class Gameboard {
    String s1 = "1";
    String s2 = "2";
    String s3 = "3";
    String s4 = "4";
    String s5 = "5";
    String s6 = "6";
    String s7 = "7";
    String s8 = "8";
    String s9 = "9";
    public Gameboard(){

    }
    public String toString(){
        return  "                    |     |      \n" +
                "                 "+s1+"  |  "+s2+"  |  "+s3+"   \n" +
                "               _____|_____|_____ \n" +
                "                    |     |      \n" +
                "                 "+s4+"  |  "+s5+"  |  "+s6+"   \n" +
                "               _____|_____|_____ \n" +
                "                    |     |      \n" +
                "                 "+s7+"  |  "+s8+"  |  "+s9+"   \n" +
                "                    |     |      ";
    }
}
