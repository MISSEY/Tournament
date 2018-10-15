/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tournament;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 

/**
 *
 * @author Saurabh
 */

public class Tournament {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberofteams;
        Team[] teams = new Team[100];
        Team[] final_teams=new Team[3];
        Tournament1 t = new Tournament1();
        String name,citizen;
        System.out.println("Enter number of teams to be played");
        Scanner sc= new Scanner(System.in); 
        numberofteams = sc.nextInt();
        for(int i=1;i<=numberofteams;i++){
            teams[i]=new Team();
            System.out.println("Enter name of the team");
            Scanner scanner = new Scanner(System.in);
            name=scanner.nextLine(); 
            System.out.println("Enter name of the citizenship");
            Scanner scanner1 = new Scanner(System.in);
            citizen=scanner1.nextLine();
            teams[i].Name=name;
            teams[i].Citizenship=citizen;
        }
        
        System.out.println("Matches");
        
        for(int i = 1; i<numberofteams;i++){
            for(int j=i+1;j<=numberofteams;j++){
                Match m=new Match(teams[i],teams[j]);
                System.out.println(teams[i].Name+ "  Vs  "+ teams[j].Name);
                t.addMatch(m);
            }
        }
       int max_ind;
       for(int i=1;i<numberofteams;i++){
        
           for(int j=i+1;j<=numberofteams;j++){
                if(teams[i].totalscores<teams[j].totalscores){
                    Team temp = teams[i]; 
                    teams[i] = teams[j]; 
                    teams[j] = temp; 
                    
                }
                
           }
       }
       for (int i=1; i<=2; i++){
           final_teams[i]=teams[i];
       }
       System.out.println("** Stangings are **");
       System.out.println("Team Name       Citizenship      FinalScores");
       for (int i=1; i<=numberofteams; i++){
            System.out.println( teams[i].Name+"               "+ teams[i].Citizenship+ "                   "+ teams[i].totalscores);
       }
       System.out.println("*******************************************");
       
       System.out.println("Finalists are "+ final_teams[1].Name+" and "+ final_teams[2].Name);
       Match m = new Match(final_teams[1],final_teams[2]);
       t.final_match(m);
       
        // TODO code application logic here
    }
}
