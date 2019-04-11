package ladder.domain;

import org.junit.Test;

import static ladder.domain.Fixture.*;
import static org.assertj.core.api.Assertions.assertThat;

public class LadderGameResultTest {

    @Test
    public void 실행결과_단건_가져오기() {
        LadderGameResult ladderGameResult = LADDER_GAME_RESULT;
        ladderGameResult.initPlayResults(PLAY_RESULTS);

        PlayResult result = ladderGameResult.findResultByName(HYERIN);
        assertThat(result).isEqualTo(HYERIN_PLAY_RESULT);
    }

    @Test
    public void 실행결과_모두_가져오기() {
        LadderGameResult ladderGameResult = LADDER_GAME_RESULT;
        ladderGameResult.initPlayResults(PLAY_RESULTS);
        
        PlayResults result = ladderGameResult.getPlayResults();
        assertThat(result).isEqualTo(PLAY_RESULTS);
    }
}