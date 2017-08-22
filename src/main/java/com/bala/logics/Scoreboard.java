package com.bala.logics;

import com.bala.models.GameEntry;
public class Scoreboard {
    private GameEntry [] gameEntries;
    private int entries;

    public Scoreboard(int capacity){
        gameEntries = new GameEntry[capacity];
    }

    public void addEntry(GameEntry gameEntry){
        int score = gameEntry.getScore();
        if(entries < gameEntries.length ||score > gameEntries[entries-1].getScore()){
            if(entries < gameEntries.length){
                entries++;
            }
            int lastEntry = entries-1;
            while(lastEntry>0 && gameEntries[lastEntry-1].getScore() <score){
                gameEntries[lastEntry]=gameEntries[lastEntry-1];
                lastEntry--;
            }
            gameEntries[lastEntry]=gameEntry;
        }
    }

    public String toString(){
      return  String.valueOf(gameEntries[0].getScore());
    }
}