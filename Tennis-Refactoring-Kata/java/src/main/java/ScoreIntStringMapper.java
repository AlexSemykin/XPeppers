import java.util.HashMap;
import java.util.Map;

public class ScoreIntStringMapper {
    private Map<Integer,String> scoreMapper;
    private Map<Integer,String> equalScoreMapper;

    public ScoreIntStringMapper(){
        initScoreMapper();
        initEqualScoreMapper();
    }

    private void initScoreMapper() {
        scoreMapper = new HashMap<Integer, String>();

        scoreMapper.put(0, "Love");
        scoreMapper.put(1, "Fifteen");
        scoreMapper.put(2, "Thirty");
        scoreMapper.put(3, "Forty");
    }

    private void initEqualScoreMapper() {
        equalScoreMapper = new HashMap<Integer, String>();

        equalScoreMapper.put(0, "Love-All");
        equalScoreMapper.put(1, "Fifteen-All");
        equalScoreMapper.put(2, "Thirty-All");
        equalScoreMapper.put(3, "Deuce-All");
    }

    public String getStringScore(int score){
        return scoreMapper.get(score);
    }

    public String getEqualScoreMapper(int score){
        return equalScoreMapper.get(score);
    }
}
