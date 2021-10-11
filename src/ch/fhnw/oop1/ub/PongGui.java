package ch.fhnw.oop1.ub;

import gui.Window;

public class PongGui {

    public static int WIDTH = 800;
    public static int HEIGHT = 600;

    public static void main(String[] args) {

        PongGame game = new PongGame(WIDTH, HEIGHT);

        Window window = new Window("Pong", WIDTH, HEIGHT);

        window.setColor(0, 255, 0);
        window.setBold(true);
        window.setFontSize(40);
        window.drawStringCentered("Crazy Cool Pong", 400, 50);

        window.open();

        // Game loop
        while (window.isOpen()) {
            // Prozessiert Benutzereingaben
            game.handleEvents(window);

            // Prozessiert einen einzelnen Zeitschritt
            game.step();

            // Zeichnet den Spielzustand
            game.drawGame(window);

            window.refreshAndClear(50);
        }
    }
}
