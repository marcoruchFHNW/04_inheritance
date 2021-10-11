package ch.fhnw.oop1.ub;

import gui.Window;

public class PongGame {

    private int width;
    private int height;
    private Ball ball;
    private Player playerLeft;
    private Player playerRight;

    private GameObject north;
    private GameObject east;
    private GameObject south;
    private GameObject west;

    public PongGame(int width, int height) {
        this.width = width;
        this.height = height;

        ball = new Ball(200, 200, 5, 5);
        playerLeft = new Player(10, PongGui.HEIGHT / 2 + 30, 75, 10);
        playerRight = new Player(PongGui.WIDTH - 20, PongGui.HEIGHT / 2 + 30, 75, 10);

        createWalls();
    }

    public void handleEvents(Window window) {
        if (window.isKeyPressed("up")) {
            playerRight.moveUp();
        }

        if (window.isKeyPressed("down")) {
            playerRight.moveDown();
        }

        if (window.isKeyPressed("w")) {
            playerLeft.moveUp();
        }

        if (window.isKeyPressed("x")) {
            playerLeft.moveDown();
        }
    }

    public void step() {
        if (north.intersects(ball)) {
            ball.bounceOfVertical();
        }

        if (south.intersects(ball)) {
            ball.bounceOfVertical();
        }

        if (playerLeft.intersects(ball)) {
            ball.bounceOfHorizontal();
        }

        if (playerRight.intersects(ball)) {
            ball.bounceOfHorizontal();
        }

        ball.step();
    }

    public void drawGame(Window window) {
        playerLeft.draw(window);
        playerRight.draw(window);

        ball.draw(window);

        north.draw(window);
        east.draw(window);
        south.draw(window);
        west.draw(window);

        var scoreString = "Left " + playerLeft.getScore() + " // " + playerRight.getScore() + " Right";
        window.drawStringCentered(scoreString, 400, 100);
    }

    public void createWalls() {
        north = new GameObject(0, 0, 5, PongGui.WIDTH);
        east = new GameObject(PongGui.WIDTH - 5, 0, PongGui.HEIGHT - 5, 5);
        south = new GameObject(0, PongGui.HEIGHT - 5, 5, PongGui.WIDTH -5);
        west = new GameObject(0, 0, PongGui.HEIGHT, 5);
    }
}
