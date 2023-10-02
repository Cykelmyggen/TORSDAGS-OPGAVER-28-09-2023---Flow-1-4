public class Team {
    private String teamName;
    private int rank;
    private String[] players;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "" + teamName + " Rank: " + rank;
    }
}
