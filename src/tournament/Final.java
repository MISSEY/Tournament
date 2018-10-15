/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tournament;

/**
 *
 * @author Saurabh
 */
import java.util.Random;

public class Final {
    int penalty1=0,penalty2=0,n;
    Team winner;
    String status_team1,status_team2;
    Random rand1=new Random();
    Team finalpenalties(Team Team1,Team Team2){
        for(int i=1;i<=5;i++){
             n=rand1.nextInt(2);
             if(n==0){
                 status_team1="missed";
             }
             else{
                 status_team1="Goal";
             }
             penalty1 +=n;
             
             n=rand1.nextInt(2);
             if(n==0){
                 status_team2="missed";
             }
             else{
                 status_team2="Goal";
             }
             penalty2 += n;
             System.out.println(Team1.Name+": "+ penalty1+"( "+status_team1+" )     "+Team2.Name+": "+penalty2+"( "+status_team2+" )");
             if(i==3){
                 int n=Math.abs(penalty1-penalty2);
                 if(n==3){
                     if(penalty1>penalty2){
                        winner=Team1;  
                     }
                     else{
                         winner=Team2;
                     }
                     break;
                 }
             }
             else if(i==4){
                 int n=Math.abs(penalty1-penalty2);
                 if(n>=2){
                     if(penalty1>penalty2){
                        winner=Team1;  
                     }
                     else{
                         winner=Team2;
                     }
                     break;
                 }
             }
             else if(i==5) {
                 if(penalty1>penalty2){
                        winner=Team1;  
                     }
                     else{
                         winner=Team2;
                     }
             }
        }
        
        //if penalties are equal
        while(penalty1==penalty2){
                n=rand1.nextInt(2);
                if(n==0){
                    status_team1="missed";
                }
                else{
                    status_team1="Goal";
                }
                penalty1 +=n;
             
                n=rand1.nextInt(2);
                if(n==0){
                    status_team2="missed";
                }
                else{
                    status_team2="Goal";
                }
                penalty2 += n;
                System.out.println(Team1.Name+": "+ penalty1+"( "+status_team1+" )     "+Team2.Name+": "+penalty2+"( "+status_team2+" )");
                if(penalty1>penalty2){
                        winner=Team1;  
                }
                else{
                        winner=Team2;
                }
        }
        return winner;
    }
    
}
