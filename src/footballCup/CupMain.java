package footballCup;

import footballCup.round.Round;
import footballCup.round.RoundController;
import footballCup.team.Amateur;
import footballCup.team.Professional;
import footballCup.team.Team;

import java.util.ArrayList;
import java.util.Collections;

public class CupMain {

    public static void main(String[] args) {

        String[] professionalListTeamName = {"Barca", "Real Mad.", "Ajax", "Milan"};
        int[] professionalListBudget = {29, 30, 31, 32};
        String[] professionalListSponsor = {"Philips", "Capgemini", "Petrol", "Qatar Air Line"};


        String[] amateurlListTeamName = {"Ijburg", "Zeeburg", "Miamy", "Kees"};
        String[] amateurlListMascot = {"bikky", "winky", "lala", "Bob"};
        String[] amateurlListHomeBar = {"XXX", "ZZZ", "CCC", "BBB"};

        ArrayList<Team> fullTeamsList = new ArrayList();

        for (int i = 0; i < professionalListTeamName.length; i++) {
            fullTeamsList.add(new Professional(professionalListTeamName[i],professionalListBudget[i],professionalListSponsor[i]));
        }
        for (int i = 0; i < amateurlListTeamName.length; i++) {
            fullTeamsList.add(new Amateur(amateurlListTeamName[i],amateurlListMascot[i],amateurlListHomeBar[i]));
        }

        Collections.shuffle(fullTeamsList);

        Round round = new Round("One");
        Round round2 = new Round("Two");
        Round round3 = new Round("Three");

        RoundController.startTournament(fullTeamsList);


        ArrayList<Team> round1Winners = RoundController.roundResults(round, fullTeamsList);
        ArrayList<Team> round2Winners = RoundController.roundResults(round2, round1Winners);
        ArrayList<Team> round3Winners = RoundController.roundResults(round3, round2Winners);

        RoundController.endTournament(round3Winners.get(0));



    }
}
