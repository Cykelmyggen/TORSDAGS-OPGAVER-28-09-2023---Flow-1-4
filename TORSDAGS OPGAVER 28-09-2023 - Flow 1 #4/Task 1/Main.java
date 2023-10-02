public class Main {
    public static void main(String[] args) {
        
        Team team1 = new Team("De Uovervindelige");
        team1.setRank(3);
        System.out.println(team1.toString());

        
        Team team2 = new Team("Team2");
        team2.setRank(5);
        System.out.println(team2.toString());

        Team team3 = new Team("Team3");
        team3.setRank(2);
        System.out.println(team3.toString());

        Team team4 = new Team("Team4");
        team4.setRank(1);
        System.out.println(team4.toString());

        Team team5 = new Team("Team5");
        team5.setRank(4);
        System.out.println(team5.toString());

        Team team6 = new Team("Team6");
        team6.setRank(6);
        System.out.println(team6.toString());
    }
}
