package quizz3;

// Lớp Game đại diện cho trò chơi Car Racing
class Game {
    private Car[] cars;
    private Player player;

    public Game(Car[] cars, Player player) {
        this.cars = cars;
        this.player = player;
    }

    public void play() {
        System.out.println("Game started!");

        while (true) {
            for (Car car : cars) {
                car.move();

                if (car.getPosition() >= 100) {
                    System.out.println(car.getName() + " wins the game!");
                    player.increaseScore();
                    return;
                }
            }
        }
    }
}