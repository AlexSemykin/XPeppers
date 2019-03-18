import java.util.HashMap;
import java.util.Map;

public class ScoreIntStringMapper {
    private Map<Integer,String> scoreMapper;
    private Map<Integer,String> equalScoreMapper;

    public ScoreIntStringMapper(){
        scoreMapper = new HashMap<Integer, String>();
        equalScoreMapper = new HashMap<Integer, String>();

        scoreMapper.put(0, "Love");
        scoreMapper.put(1, "Fifteen");
        scoreMapper.put(2, "Thirty");
        scoreMapper.put(3, "Forty");

        equalScoreMapper.put(0, "Love-All");
        equalScoreMapper.put(1, "Fifteen-All");
        equalScoreMapper.put(2, "Thirty-All");
        equalScoreMapper.put(3, "Deuce-All");
    }
}
