package quizz7;

// Lớp chính để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Khởi tạo người chơi
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');

        // Khởi tạo trò chơi
        Game game = new Game(player1, player2);

        // Bắt đầu trò chơi
        game.start();
    }
}