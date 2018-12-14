package footballCup.team;

public class Professional extends Team {

    public final String teamLevel = "Professional";


    public Professional(String name, int budget, String sponsor){
        this.setName(name);
        this.setBudget(budget);
        this.setSponsor(sponsor);
        this.setTeamCategory(teamLevel);
    }

}
