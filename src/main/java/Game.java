


public class Game {
    private final Dice dice;
    private final Player p1;
    private final Player p2;
    private final ScoreBoard scoreBoard;

    public Game(Dice dice, Player p1, Player p2, ScoreBoard scoreBoard, WinSorting leaderboard) {
        this.dice = dice;
        this.p1 = p1;
        this.p2 = p2;
        this.scoreBoard = scoreBoard;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public void playRounds(OutputProvider output) {
        int r1 = dice.rollDice();
        int r2 = dice.rollDice();
        p1.playerScores(r1);
        p2.playerScores(r2);

    }
}
