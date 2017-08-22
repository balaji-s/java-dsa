package com.bala.models;
import static java.lang.System.out;
public class GameEntry{

    public String name;
    public int score;

    public GameEntry(String name, int score){
        this.name=name;
        this.score=score;
    }
    
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    public String toString(){
        return("Name: "+ name+" "+"Score: "+ score);
    }

public static void main(String... args){
    String [] strings = new String[5];
    strings[0]="aa";
    strings[1]="bb";
    strings[2]="cc";
    strings[3]="dd";
  

    for(String str:strings){
        System.out.println(str);
    }
    out.println(strings.length);
}
}