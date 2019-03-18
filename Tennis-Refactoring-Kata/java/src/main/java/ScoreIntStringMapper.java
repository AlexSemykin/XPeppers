import java.util.HashMap;
import java.util.Map;

public class ScoreIntStringMapper {
    private Map<Integer,String> scoreMapper;
    private Map<Integer,String> equalScoreMapper;

    public ScoreIntStringMapper(){
        scoreMapper = new HashMap<Integer, String>();
        equalScoreMapper = new HashMap<Integer, String>();
    }
}
