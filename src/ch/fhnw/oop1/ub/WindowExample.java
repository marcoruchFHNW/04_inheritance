package ch.fhnw.oop1.ub;

import gui.Window;

/** 
 * Beispiel Programm zeigt die Verwendung der Klasse gui.Window.
 */
public class WindowExample {
    public static void main(String[] args) {
        Window window = new Window("Example", 800, 600);
        window.setColor(255,0,0);
        window.fillRect(100, 200, 50, 90);

        window.setColor(0, 255, 0);
        window.setBold(true);
        window.setFontSize(40);
        window.drawStringCentered("Crazy Cool Pong", 400, 50);

        window.open();

        new PongGame(200, 200);
        window.waitUntilClosed();
    }
}