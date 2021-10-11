package ch.fhnw.oop1.ub;

import gui.Window;

public class Ball extends GameObject {

    private int vx, vy;

    public Ball(int x, int y, int height, int width) {

        super(x, y, height, width);
        double signX = Math.random() > 0.5 ? 1 : -1;
        double signY = Math.random() > 0.5 ? 1 : -1;

        this.vx = (int) (signX * (2 + (Math.random() * 4)));
        this.vy = (int) (signY * (2 + (Math.random() * 4)));
    }

    @Override
    public void draw(Window window) {
        window.fillCircle(x, y, height / 2);
    }

    public void step() {
        x += vx / 1.5;
        y += vy / 1.5;
    }

    public void bounceOfHorizontal() {
        vy = -vy;
    }

    public void bounceOfVertical() {
        vx = -vx;
    }

}