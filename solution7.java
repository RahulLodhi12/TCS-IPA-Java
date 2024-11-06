import java.util.*;

public class solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];
        for(int i=0;i<4;i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Player(a,b,c,d,e);
        }

        String playerType = sc.nextLine();
        String matchType = sc.nextLine();

        int run = findPlayerWithLowestRuns(arr, playerType);
        if(run==0) System.out.println("No such player");
        else System.out.println(run);



        Integer[] res = findPlayerByMatchType(arr, matchType);
        if(res==null) System.out.println("No Player with given matchType");
        else{
            for(int i=0;i<res.length;i++){
                System.out.println(res[i]);
            }
        }

    }

    public static int findPlayerWithLowestRuns(Player[] arr, String playerType){
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getPlayerType().equalsIgnoreCase(playerType)){
                mini=Math.min(mini,arr[i].getRuns());
            }
        }
        if(mini==Integer.MAX_VALUE) return 0;
        return mini;
    }

    public static Integer[] findPlayerByMatchType(Player[] arr, String matchType){
        Integer[] arr2 = new Integer[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].getMatchType().equalsIgnoreCase(matchType)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i].getPlayerId();
                Arrays.sort(arr2,Collections.reverseOrder());
            }
        }
        if(arr2.length==0) return null;
        return arr2;
    }

}

class Player{
    int playerId;
    String playerName;
    int runs;
    String playerType;
    String matchType;

    
    public Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }


    public int getPlayerId() {
        return playerId;
    }


    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }


    public String getPlayerName() {
        return playerName;
    }


    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }


    public int getRuns() {
        return runs;
    }


    public void setRuns(int runs) {
        this.runs = runs;
    }


    public String getPlayerType() {
        return playerType;
    }


    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }


    public String getMatchType() {
        return matchType;
    }


    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    
}

/*
Input 1

11
Sachin
100
Inter
One day
12
Shewag
133
Inter
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
State
One day

Output 1

67
14
11


Input 2

11
Sachin
100
Inter
One day
12
Shewag
133
Inter
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
District
T20


Output 2

No such player
No Player with given matchType

*/
