import java.util.List;

public class TennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;
    public static final String SCORE_0 = "Love";
    public static final String SCORE_1 = "Fifteen";
    public static final String SCORE_2 = "Thirty";
    public static final String SCORE_3 = "Forty";
    private List<String> scores = List.of(SCORE_0, SCORE_1, SCORE_2, SCORE_3);


    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        if (P1point <= 3 && P2point <= 3) {
            P1res = scores.get(P1point);
            if (P1point == P2point) {
                if (P1point == 3) {
                    score = "Deuce";
                }
                else {
                    score = P1res + "-All";
                }
            }
            else {
                P2res = scores.get(P2point);
                score = P1res + "-" + P2res;
            }
        }
        else if (P1point == P2point) {
            score = "Deuce";
        }
        else if (P1point - P2point >= 2) {
            score = "Win for player1";
        }
        else if (P2point - P1point >= 2) {
            score = "Win for player2";
        }
        else if (P1point - P2point == 1) {
            score = "Advantage player1";
        }
        else if (P2point - P1point == 1) {
            score = "Advantage player2";
        }
        return score;
    }
    
    public void SetP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Score();
        }
            
    }
    
    public void SetP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
            
    }
    
    public void P1Score(){
        P1point++;
    }
    
    public void P2Score(){
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}