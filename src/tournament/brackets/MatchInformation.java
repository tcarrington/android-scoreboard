package tournament.brackets;

import java.util.Calendar;

/**
 * Created by Taylor on 10/15/13.
 */
public class MatchInformation {

    int team1 = 1;
    int team2 = 2;

    int team1Score = 0;
    int team2Score = 0;
    int team1Shots = 0;
    int team2Shots = 0;
    int team1Saves = 0;
    int team2Saves = 0;

    public int getWinner(){
        if(team1Score > team2Score){
            return team1;
        }
        else if(team2Score > team1Score){
            return team2;
        }
        return 0;
    }

    public void addPoint(int point, int team){
        if(team == team1)
            team1Score+=point;
        else if(team == team2)
            team2Score+=point;
    }

    public void subPoint(int point, int team){
        if(team == team1)
            team1Score-=point;
        else if(team == team2)
            team2Score-=point;
    }

    public void addShot(int point, int team){
        if(team == team1)
            team1Shots+=point;
        else if(team == team2)
            team2Shots+=point;
    }

    public void subShot(int point, int team){
        if(team == team1)
            team1Shots-=point;
        else if(team == team2)
            team2Shots-=point;
    }


    public void addSave(int point, int team){
        if(team == team1)
            team1Saves+=point;
        else if(team == team2)
            team2Saves+=point;
    }

    public void subSave(int point, int team){
        if(team == team1)
            team1Saves-=point;
        else if(team == team2)
            team2Saves-=point;
    }
}
