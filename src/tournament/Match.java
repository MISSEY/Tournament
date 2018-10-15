/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tournament;

import java.util.Random;

/**
 *
 * @author Saurabh
 */
class Match extends Team{
    Team Team1=new Team();
    Team Team2=new Team();
    Team Team3=new Team();
    Match(){
        
    }
    Match(Team t1,Team t2){
       Team1=t1;
       Team2=t2;
    }
    
    int score1,score2;
    boolean played;
    Random rand=new Random();
    Team winner(){
        
       int n = rand.nextInt(3);
       if(n==1){
           score1=1;
           score2=1;
           Team1.totalscores=Team1.totalscores+score1;
           Team2.totalscores=Team2.totalscores+score2;
       }
       else if(n==0){
           score1=0;
           score2=2;
           Team1.totalscores=Team1.totalscores+score1;
           Team2.totalscores=Team2.totalscores+score2;
       }
       else if(n==2){
           score1=2;
           score2=0;
           Team1.totalscores=Team1.totalscores+score1;
           Team2.totalscores=Team2.totalscores+score2;
       }
       if(score1>score2){
           return Team1;
       } 
       else if(score1<score2){
           return Team2;
       }
       else{
           Team3.Name="Draw";
           Team3.totalscores=-1;
           return Team3;
       }
    }
}