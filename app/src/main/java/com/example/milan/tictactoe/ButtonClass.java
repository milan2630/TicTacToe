package com.example.milan.tictactoe;

import android.widget.Button;
import android.widget.ImageButton;

public class ButtonClass {
    ImageButton button;
    int y;
    int x;
    boolean isRed;
    boolean isBlue;
    public ButtonClass(int xCoord, int yCoord, ImageButton buttons, boolean red, boolean blue)
    {
        x = xCoord;
        y = yCoord;
        button = buttons;
        isRed = red;
        isBlue = blue;
    }
    public ButtonClass()
    {

    }



}
