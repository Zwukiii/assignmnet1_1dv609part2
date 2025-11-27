


public class Game {
    private final Dice dice;
    private final Player p1;
    private final Player p2;
    private final ScoreBoard scoreBoard;
    private final WinSorting leaderboard;

    public Game(Dice dice, Player p1, Player p2, ScoreBoard scoreBoard, WinSorting leaderboard) {
        this.dice = dice;
        this.p1 = p1;
        this.p2 = p2;
        this.scoreBoard = scoreBoard;
        this.leaderboard = leaderboard;
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
        leaderboard.addPlayers(p1);
        leaderboard.addPlayers(p2);
        leaderboard.printLeader();

    }

    public String getWinner() {
        return scoreBoard.getWinner(p1, p2);
    }

    public void playTheGame(InputProvider input, OutputProvider output) {
        int round = 1;
        output.print("Enter P to play and Q to quit");
        while (true) {
            String user = input.getInput();

            if (user.equalsIgnoreCase("Q")) {
                output.print("Game Over. Winner is: " + getWinner());
                break;
            } else if (user.equalsIgnoreCase("P")) {
                output.print("Playing Round: " + round);
                playRounds(output);

                output.print(p1.getName() + " scores:" + p1.getScore());
                output.print(p2.getName() + " scores:" + p2.getScore());

                round++;
            } else {
                output.print("Invalid Input!");
            }


        }
    }
}
