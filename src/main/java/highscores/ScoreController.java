package highscores;

import java.sql.SQLException;
import java.util.ArrayList;

public class ScoreController {
    ScoreRepository productRepository = new ScoreRepository();


    public String addScores(Score score) {

        try {
            ScoreRepository.add(score);
        } catch (SQLException e) {
            e.printStackTrace();
            return "error with adding highscore";
        }
        return "Highscore added successfully";
    }

    public ArrayList<Score> getAllScores() {
        ArrayList<Score> scores = new ArrayList<>();


        try {
            scores = ScoreRepository.getAll();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return scores;
    }

}
