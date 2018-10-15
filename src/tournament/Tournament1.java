/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tournament;

/**
 *
 * @author Saurabh
 */
class Tournament1 extends Match{
    Team t;
    Final w=new Final();
    
    void inviteTeam(String name,String citizen){
        System.out.println(name);
            Name=name;
            Citizenship=citizen;
    }
    void addMatch(Match m){
        t=m.winner();
        if(t.totalscores==-1){
            System.out.println("Match is draw");
        }
        else{
            System.out.println("Match won by "+t.Name);
        }
        
        
    }
  void final_match(Match m){
      t=m.winner();
     if(t.totalscores==-1){
            System.out.println("Final Match is draw and Winner will be decided by penalties");
            t=w.finalpenalties(m.Team1,m.Team2);
            
            System.out.println("Tournament won by:"+t.Name);

        }
        else{
            System.out.println("Tournament won by "+t.Name);
        }
  }
 
}