package highscores;

import database.DBHandler;

import java.sql.*;
import java.util.ArrayList;

public class ScoreRepository {
    private static DBHandler dbHandler = new DBHandler();

    public static void add(Score score) throws SQLException {
        Connection connection = dbHandler.getConnection();
        String query = "INSERT INTO highscore(highscore) VALUES(?,?,?)";
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        preparedStatement.setFloat(1, score.highscore);
        preparedStatement.execute();

        preparedStatement.close();
    }

    public static ArrayList<Score> getAll() throws SQLException {
        Statement statement = dbHandler.getConnection().createStatement();

        String query = "SELECT * FROM products";
        ResultSet results = statement.executeQuery(query);
        ArrayList<Score> scores = new ArrayList<>();

        while (results.next()) {
            int id = results.getInt("id");
            float highscore = results.getFloat("highscore: ");
            String created_at = results.getString("created_at");

            scores.add(new Score(id, highscore, created_at));

        }
        statement.close();

        return scores;
    }

}
