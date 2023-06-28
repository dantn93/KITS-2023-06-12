package quizz7;

import java.util.Scanner;

// Lớp Game đại diện cho trò chơi
class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayer = player1;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean gameEnd = false;

            while (!gameEnd) {
                System.out.println("Current player: " + currentPlayer.getName());
                System.out.println("Enter row (0-2): ");
                int row = scanner.nextInt();
                System.out.println("Enter column (0-2): ");
                int col = scanner.nextInt();

                if (isValidMove(row, col)) {
                    board.markCell(row, col, currentPlayer.getSymbol());
                    board.printBoard();

                    if (board.checkWin(currentPlayer.getSymbol())) {
                        System.out.println(currentPlayer.getName() + " wins!");
                        gameEnd = true;
                    } else if (board.isBoardFull()) {
                        System.out.println("It's a draw!");
                        gameEnd = true;
                    } else {
                        switchPlayer();
                    }
                } else {
                    System.out.println("Invalid move. Please try again.");
                }
            }
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < Board.SIZE && col >= 0 && col < Board.SIZE && board.isCellEmpty(row, col);
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}