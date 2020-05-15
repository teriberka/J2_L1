package ru.geekbrains.J2.L1.hometask.circles;

import java.awt.*;

public interface GameInterface {
    void update(MainCanvas canvas, float deltaTime);
    void render(MainCanvas canvas, Graphics g);
}
