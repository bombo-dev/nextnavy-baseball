package baseball.domain.game;

public class PlayResult {
    private int strike;
    private int ball;

    public void addStrike() {
        strike++;
    }

    public void addBall() {
        ball++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (isNothing()) {
            return "낫싱";
        }

        appendBallCount(sb);
        appendStrikeCount(sb);

        return sb.toString().trim();
    }

    private boolean isNothing() {
        return ball == 0 && strike == 0;
    }

    private void appendBallCount(StringBuilder sb) {
        if (ball != 0) {
            sb.append(ball).append("볼").append(" ");
        }
    }

    private void appendStrikeCount(StringBuilder sb) {
        if (strike != 0) {
            sb.append(strike).append("스트라이크");
        }
    }
}
