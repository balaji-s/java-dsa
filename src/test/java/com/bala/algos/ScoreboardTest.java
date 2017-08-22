package com.bala.algos;
import org.junit.Assert;
import org.junit.Test;

import com.bala.logics.Scoreboard;
import com.bala.models.GameEntry;


public class ScoreboardTest{

    @Test
    public void happyPath(){
        Scoreboard scoreboard=  new Scoreboard(10);
      
      GameEntry gameEntries[] = {
        new GameEntry("bal", 2),
         new GameEntry("ad", 23),
         new GameEntry("df", 22),
         new GameEntry("er", 21),
         new GameEntry("ere", 20),
         new GameEntry("er3", 12),
         new GameEntry("ge", 52),
         new GameEntry("berval", 72),
         new GameEntry("fve", 62)};

        for(GameEntry ge : gameEntries){
            scoreboard.addEntry(ge);
        }
         Assert.assertTrue(scoreboard.toString().equals("72"));
    }
}