package ladder.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Getter
@ToString
@EqualsAndHashCode
public class Ladder {
    public static final int MIN_FLOOR = 2;
    private List<Line> lines = new ArrayList<>();

    public Ladder(int countOfPerson, int height) {
        validateHeight(height);
        lines.addAll(initLine(countOfPerson, height));
    }

    private void validateHeight(int height) {
        if(height < MIN_FLOOR) {
            throw new IllegalArgumentException("적어도 2층정돈 해줘야죠ㅠㅠ");
        }
    }

    List<Line> initLine(int countOfPerson, int height) {
        List<Line> initLines = new ArrayList<>();
        IntStream.range(0, height).forEach(count -> initLines.add(new Line(countOfPerson)));
        return initLines;
    }
}
