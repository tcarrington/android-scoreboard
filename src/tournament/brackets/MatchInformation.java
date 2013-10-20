package tournament.brackets;

import java.util.Calendar;

/**
 * Created by Taylor on 10/15/13.
 */
public class MatchInformation {

    int team1Score = 0;
    int team2Score = 0;

    public int getTeam1Score(){
        return team1Score;
    }

    public int getTeam2Score(){
        return team2Score;
    }

    public int getWinner(){
        if(team1Score > team2Score){
            return 1;
        }
        else if(team2Score > team1Score){
            return 2;
        }
        return 0;
    }

    public void addPoint(int point){
        team1Score+=point;
    }

    public void subPoint(int point){
        team1Score-=point;
    }

}
