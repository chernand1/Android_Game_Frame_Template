package com.example.carlos.game.state;

import android.view.MotionEvent;

import com.example.carlos.framework.util.Painter;
import com.example.carlos.simpleandroidgdf.Assets;

public class MenuState extends State {

    @Override
    public void init() {

    }

    @Override
    public void update(float delta) {
    }

    @Override
    public void render(Painter g) {
        g.drawImage(Assets.welcome, 0, 0);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
