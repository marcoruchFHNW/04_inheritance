package ch.fhnw.oop1.ub;

import gui.Window;

public class Player extends GameObject {
    private int score;

    public Player(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    public int getScore() {
        return score;
    }

    @Override
    public void draw(Window window) {
        window.fillRect(x, y, width, height);
    }

    public void moveUp() {
        y -= 10;
    }

    public void moveDown() {
        y += 10;
    }

    public void incScore() {
        score++;
    }

}
