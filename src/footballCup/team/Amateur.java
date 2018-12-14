package footballCup.team;

public class Amateur extends Team {
    public final String teamLevel = "Amateur";


    public Amateur(String name,String mascot,String homeBar){
        this.setName(name);
        this.setHomeBar(homeBar);
        this.setMascot(mascot);
        this.setTeamCategory(teamLevel);

    }
}
