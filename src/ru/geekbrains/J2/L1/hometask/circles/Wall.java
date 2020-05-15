package ru.geekbrains.J2.L1.hometask.circles;

import java.awt.*;

public class Wall implements GameInterface {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    public void update(MainCanvas gameCanvas, float deltaTime) {
        time += deltaTime;
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time / 3));
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time / 2));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time / 1));
        color = new Color(red, green, blue);
    }

    @Override
    public void render(MainCanvas gameCanvas, Graphics g) {
        gameCanvas.setBackground(color);
    }
}
