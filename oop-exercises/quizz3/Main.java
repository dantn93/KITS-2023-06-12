package quizz3;

// Lớp chính để kiểm tra chương trình
public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng Car
        Car car1 = new Car("Car 1");
        Car car2 = new Car("Car 2");

        // Khởi tạo đối tượng Player
        Player player = new Player("Player");

        // Khởi tạo đối tượng Game
        Game game = new Game(new Car[] { car1, car2 }, player);

        // Bắt đầu trò chơi
        game.play();

        // Hiển thị điểm số của người chơi
        System.out.println("Player's score: " + player.getScore());
    }
}