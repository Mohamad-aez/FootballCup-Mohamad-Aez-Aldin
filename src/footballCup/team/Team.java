package footballCup.team;

public  abstract class  Team {
    private String name;
    private String teamCategory;
    private int budget;
    private String sponsor;
    private String mascot;
    private String homeBar;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public String getHomeBar() {
        return homeBar;
    }

    public void setHomeBar(String homeBar) {
        this.homeBar = homeBar;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setTeamCategory(String teamCategory) {
        this.teamCategory = teamCategory;
    }

    public String getName() {
        return name;
    }



    public String getTeamCategory() {
        return teamCategory;
    }
}