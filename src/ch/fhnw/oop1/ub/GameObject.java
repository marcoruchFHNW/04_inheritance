package ch.fhnw.oop1.ub;

import gui.Window;

public class GameObject {

    int height, width;

    int x, y;

    public GameObject(int x, int y, int height, int width) {

        this.x = x;

        this.y = y;

        this.height = height;

        this.width = width;

    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void draw(Window window) {
        window.fillRect(x, y, width, height);
    }

    public boolean intersects(GameObject other) {
        return x - width / 2 < other.x + other.width / 2 && x + width / 2 > other.x - other.width / 2
                && y - height / 2 < other.y + other.height / 2 && y + height / 2 > other.y - other.height / 2;
    }

}