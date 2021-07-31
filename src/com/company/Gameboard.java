package com.company;

public class Gameboard {
    String s1 = " ";
    String s2 = " ";
    String s3 = " ";
    String s4 = " ";
    String s5 = " ";
    String s6 = " ";
    String s7 = " ";
    String s8 = " ";
    String s9 = " ";
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
