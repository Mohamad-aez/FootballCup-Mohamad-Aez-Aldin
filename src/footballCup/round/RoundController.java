package footballCup.round;

import footballCup.team.Team;

import java.util.ArrayList;

public class RoundController {

    /* Start the Tournament Method
       Printing all Teams Info. */
    public static void startTournament(ArrayList<Team> teamList) {
        System.out.println("All Teams Info. : \n");
        teamList.forEach(team -> {
            if (team.getTeamCategory() == "Professional") {
                System.out.println("Name : " + team.getName() + " , Team Level : " + team.getTeamCategory() + " , Budget : " + team.getBudget() + " , Sponsor : " + team.getSponsor());

            } else {
                System.out.println("Name : " + team.getName() + " ,Team Level : " + team.getTeamCategory() + " , Mascot : " + team.getMascot() + " , Home Bar : " + team.getHomeBar());
            }
        });

    }
    // End of Tournament Method


    public static ArrayList<Team> roundResults(Round round, ArrayList<Team> TeamList) {

        System.out.println("\n \n *******  Round " + round.name + "  *******    \n\n");

        ArrayList<Team> firstGroup = new ArrayList();
        ArrayList<Team> secondGroup = new ArrayList();

         // looping through the main TeamList and creating tow list group from it's elements
        for (int i = 0; i < TeamList.size(); i = i + 2) {
            firstGroup.add(TeamList.get(i));
            secondGroup.add(TeamList.get(i + 1));
        }

        // creating winningTeams list by creating two random scores for each team and compare them to select the winner
        ArrayList<Team> winningTeams = new ArrayList();

        for (int i = 0; i < firstGroup.size(); i++) {
            int team1Score = 0;
            int team2Score = 0;
            while (team1Score == team2Score) {
                team1Score = 0 + (int) (Math.random() * ((10 - 0) + 1));
                team2Score = 0 + (int) (Math.random() * ((10 - 1) + 1));

                if (team1Score > team2Score) {
                    firstGroup.get(i).setScore(team1Score);
                    secondGroup.get(i).setScore(team2Score);
                    winningTeams.add(firstGroup.get(i));
                } else if (team1Score < team2Score) {
                    firstGroup.get(i).setScore(team1Score);
                    secondGroup.get(i).setScore(team2Score);
                    winningTeams.add(secondGroup.get(i));

                }

            }
            // printing the Match info in each round
            System.out.println("\n   Game " + (i + 1) + ": ");
            System.out.println(firstGroup.get(i).getName() + "  VS  " + secondGroup.get(i).getName());
            System.out.println("   " + firstGroup.get(i).getScore() + "   " + "       " + secondGroup.get(i).getScore());
        }
            System.out.println("\n\n ------------- Rond " + round.name + "Winning Teams ------------- \n\n ");

            winningTeams.forEach(team -> {
                if(team.getTeamCategory()== "Professional"){
                    System.out.println("Name: " + team.getName() + " , Budget : " + team.getBudget() + " , Level: " + team.getTeamCategory() + " , Sponsor : " + team.getSponsor() + " , Score : " + team.getScore());
                }else {
                    System.out.println("Name: " + team.getName() + " , Mascot : " + team.getMascot() + " , Level: " + team.getTeamCategory() + " , Home Bar : " + team.getHomeBar()+ " , Score : " + team.getScore());
                }

            });
            return winningTeams;


    }
        // endTournament to print the final winner

        public static void endTournament (Team team) {
            System.out.println("\n\n ***** Winning Team ***** \n\n ");
            if(team.getTeamCategory()== "Professional"){
                System.out.println("Name: " + team.getName() + " , Budget : " + team.getBudget() + " , Level: " + team.getTeamCategory() + " , Sponsor : " + team.getSponsor());
            }else {
                System.out.println("Name: " + team.getName() + " , Mascot : " + team.getMascot() + " , Level: " + team.getTeamCategory() + " , Home Bar : " + team.getHomeBar());
            }
            System.out.println("\n\n ------------- End Of Cup ------------- \n\n ");

    }


}