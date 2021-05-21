package highscores;

import java.util.ArrayList;

public class Score {
    public Integer id;
    public float highscore;
    String created_at;

    public Score(Integer id, float highscore, String created_at) {
        this.id = id;
        this.highscore = highscore;
        this.created_at = created_at;
    }

    public Score() {
    }
}
