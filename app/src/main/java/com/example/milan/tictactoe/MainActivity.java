package com.example.milan.tictactoe;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.example.milan.tictactoe.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private int i;
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button b10;
    boolean n1, n2, n3, n4, n5, n6, n7, n8, n9;
    boolean a1, a2, a3, a4, a5, a6, a7, a8, a9;
    int[] redYCount;
    int redYInd;
    int[] blueYCount;
    int blueYInd;
    int[] redXCount;
    int redXInd;
    int[] blueXCount;
    int blueXInd;
    ButtonClass buttonA;
    ButtonClass buttonB;
    ButtonClass buttonC ;
    ButtonClass buttonD ;
    ButtonClass buttonE;
    ButtonClass buttonF;
    ButtonClass buttonG;
    ButtonClass buttonH;
    ButtonClass buttonI;
    ButtonClass[][] board = new ButtonClass[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        n1 = true;
        n2 = true;
        n3 = true;
        n4 = true;
        n5 = true;
        n6 = true;
        n7 = true;
        n8 = true;
        n9 = true;
        a1 = false;
        a2 = false;
        a3 = false;
        a4 = false;
        a5 = false;
        a6 = false;
        a7 = false;
        a8 = false;
        a9 = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        b1 = (ImageButton) this.findViewById(R.id.button_1);
        b1.setOnClickListener(this);
        b2 = (ImageButton) this.findViewById(R.id.button_2);
        b2.setOnClickListener(this);
        b3 = (ImageButton) this.findViewById(R.id.button_3);
        b3.setOnClickListener(this);
        b4 = (ImageButton) this.findViewById(R.id.button_4);
        b4.setOnClickListener(this);
        b5 = (ImageButton) this.findViewById(R.id.button_5);
        b5.setOnClickListener(this);
        b6 = (ImageButton) this.findViewById(R.id.button_6);
        b6.setOnClickListener(this);
        b7 = (ImageButton) this.findViewById(R.id.button_7);
        b7.setOnClickListener(this);
        b8 = (ImageButton) this.findViewById(R.id.button_8);
        b8.setOnClickListener(this);
        b9 = (ImageButton) this.findViewById(R.id.button_9);
        b9.setOnClickListener(this);
        b10 = (Button) this.findViewById(R.id.new_game);
        b10.setOnClickListener(this);
        i = 0;
        redYCount = new int[9];
        redYInd = 0;
        blueYCount = new int[9];
        blueYInd = 0;
        redXCount = new int[9];
        redXInd = 0;
        blueXCount = new int[9];
        blueXInd = 0;
        buttonA = new ButtonClass(1, 3, b1, false, false);
        buttonB = new ButtonClass(2, 3, b2, false, false);
        buttonC = new ButtonClass(3, 3, b3, false, false);
        buttonD = new ButtonClass(1, 2, b4, false, false);
        buttonE = new ButtonClass(2, 2, b5, false, false);
        buttonF = new ButtonClass(3, 2, b6, false, false);
        buttonG = new ButtonClass(1, 1, b7, false, false);
        buttonH = new ButtonClass(2, 1, b8, false, false);
        buttonI = new ButtonClass(3, 1, b9, false, false);
        board[0][0] = buttonA;
        board[0][1] = buttonB;
        board[0][2] = buttonC;
        board[1][0] = buttonD;
        board[1][1] = buttonE;
        board[1][2] = buttonF;
        board[2][0] = buttonG;
        board[2][1] = buttonH;
        board[2][2] = buttonI;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void onClick(View v) {
        ButtonClass temp = new ButtonClass(0,1,b1,false,false);
        switch (v.getId()) {
            case R.id.button_1:
                if (n1 == true) {
                    if (i % 2 == 0) {
                        b1.setBackgroundColor(Color.RED);
                        board[0][0].isRed = true;
                        redYCount[redYInd] = buttonA.y;
                        redYInd++;
                        redXCount[redXInd] = buttonA.x;
                        redXInd++;
                        temp = board[0][0];

                    }
                    if (i % 2 == 1) {
                        b1.setBackgroundColor(Color.BLUE);
                        board[0][0].isBlue = true;
                        blueYCount[blueYInd] = buttonA.y;
                        temp = board[0][0];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonA.x;
                        blueXInd++;
                    }
                    n1 = false;
                    i++;
                }
                break;
            case R.id.button_2:


                if (n2 == true) {
                    if (i % 2 == 0) {
                        b2.setBackgroundColor(Color.RED);
                        board[0][1].isRed = true;
                        redYCount[redYInd] = buttonB.y;
                        temp = board[0][1];
                        redYInd++;
                        redXCount[redXInd] = buttonB.x;
                        redXInd++;

                    }
                    if (i % 2 == 1) {
                        b2.setBackgroundColor(Color.BLUE);
                        board[0][1].isBlue = true;
                        blueYCount[blueYInd] = buttonB.y;
                        temp = board[0][1];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonB.x;
                        blueXInd++;
                    }
                    i++;
                    n2 = false;
                }


                break;
            case R.id.button_3:

                if (n3 == true) {
                    if (i % 2 == 0) {
                        b3.setBackgroundColor(Color.RED);
                        board[0][2].isRed = true;
                        redYCount[redYInd] = buttonC.y;
                        temp = board[0][2];
                        redYInd++;
                        redXCount[redXInd] = buttonC.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b3.setBackgroundColor(Color.BLUE);
                        board[0][2].isBlue = true;
                        blueYCount[blueYInd] = buttonC.y;
                        temp = board[0][2];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonC.x;
                        blueXInd++;
                    }
                    i++;
                    n3 = false;
                }


                break;
            case R.id.button_4:

                if (n4 == true) {
                    if (i % 2 == 0) {
                        b4.setBackgroundColor(Color.RED);
                        board[1][0].isRed = true;
                        redYCount[redYInd] = buttonD.y;
                        temp = board[1][0];
                        redYInd++;
                        redXCount[redXInd] = buttonD.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b4.setBackgroundColor(Color.BLUE);
                        board[1][0].isBlue = true;
                        blueYCount[blueYInd] = buttonD.y;
                        temp = board[1][0];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonD.x;
                        blueXInd++;

                    }
                    i++;
                    n4 = false;
                }

                break;
            case R.id.button_5:

                if (n5 == true) {
                    if (i % 2 == 0) {
                        b5.setBackgroundColor(Color.RED);
                        board[1][1].isRed = true;
                        redYCount[redYInd] = buttonE.y;
                        temp = board[1][1];
                        redYInd++;
                        redXCount[redXInd] = buttonE.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b5.setBackgroundColor(Color.BLUE);
                        board[1][1].isBlue = true;
                        blueYCount[blueYInd] = buttonE.y;
                        temp = board[1][1];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonE.x;
                        blueXInd++;
                    }
                    i++;
                    n5 = false;
                }
                break;
            case R.id.button_6:

                if (n6 == true) {
                    if (i % 2 == 0) {
                        b6.setBackgroundColor(Color.RED);
                        board[1][2].isRed = true;
                        redYCount[redYInd] = buttonF.y;
                        temp = board[1][2];
                        redYInd++;
                        redXCount[redXInd] = buttonF.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b6.setBackgroundColor(Color.BLUE);
                        board[1][2].isBlue = true;
                        blueYCount[blueYInd] = buttonF.y;
                        temp = board[1][2];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonF.x;
                        blueXInd++;
                    }
                    i++;
                    n6 = false;
                }
                break;
            case R.id.button_7:

                if (n7 == true) {
                    if (i % 2 == 0) {
                        b7.setBackgroundColor(Color.RED);
                        board[2][0].isRed = true;
                        redYCount[redYInd] = buttonG.y;
                        temp = board[2][0];
                        redYInd++;
                        redXCount[redXInd] = buttonG.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b7.setBackgroundColor(Color.BLUE);
                        board[2][0].isBlue = true;
                        blueYCount[blueYInd] = buttonG.y;
                        temp = board[2][0];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonG.x;
                        blueXInd++;
                    }
                    i++;
                    n7 = false;
                }
                break;
            case R.id.button_8:

                if (n8 == true) {
                    if (i % 2 == 0) {
                        b8.setBackgroundColor(Color.RED);
                        board[2][1].isRed = true;
                        redYCount[redYInd] = buttonH.y;
                        temp = board[2][1];
                        redYInd++;
                        redXCount[redXInd] = buttonH.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b8.setBackgroundColor(Color.BLUE);
                        board[2][1].isBlue = true;
                        blueYCount[blueYInd] = buttonH.y;
                        temp = board[2][1];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonH.x;
                        blueXInd++;
                    }
                    i++;
                    n8 = false;
                }
                break;
            case R.id.button_9:

                if (n9 == true) {
                    if (i % 2 == 0) {
                        b9.setBackgroundColor(Color.RED);
                        board[2][2].isRed = true;
                        redYCount[redYInd] = buttonI.y;
                        temp = board[2][2];
                        redYInd++;
                        redXCount[redXInd] = buttonI.x;
                        redXInd++;
                    }
                    if (i % 2 == 1) {
                        b9.setBackgroundColor(Color.BLUE);
                        board[2][2].isBlue = true;
                        blueYCount[blueYInd] = buttonI.y;
                        temp = board[2][2];
                        blueYInd++;
                        blueXCount[blueXInd] = buttonI.x;
                        blueXInd++;
                    }
                    i++;
                    n9 = false;
                }
                break;
            case R.id.new_game:
                i = 0;
                finish();
                startActivity(getIntent());


                break;


        }
        if(redXInd >= 2)
        {
            if(redWin(temp) || blueWin(temp))
            {
                finish();
                startActivity(getIntent());
            }
        }


    }


    public boolean redWin(ButtonClass btnClicked) {

        int yVal = btnClicked.y;
        int xVal = btnClicked.x;
        boolean diagonalWin = false;
        if(xVal + yVal == 4)
        {
            diagonalWin = diagonalDownChecker(true);
        }
        else if(xVal == yVal)
        {
            diagonalWin = diagonalUpChecker(true);
        }
        if(rowCheck(yVal, true) || diagonalWin || colChecker(xVal, true))
        {
            return true;
        }
        return false;
    }
    public boolean blueWin(ButtonClass btnClicked) {

        int yVal = btnClicked.y;
        int xVal = btnClicked.x;
        boolean diagonalWin = false;
        if(xVal + yVal == 4)
        {
            diagonalWin = diagonalDownChecker(false);
        }
        else if(xVal == yVal)
        {
            diagonalWin = diagonalUpChecker(false);
        }
        if(rowCheck(yVal, false) || diagonalWin || colChecker(xVal, false))
        {
            return true;
        }
        return false;
    }
    public boolean rowCheck(int yValue, boolean red)
    {
        int counter = 0;
        if(red) {
            for (ButtonClass btn : board[3 - yValue]) {

                if (btn.isRed) {
                    counter++;
                }
            }
        }
        else {
            for (ButtonClass btn : board[3 - yValue]) {
                if (btn.isBlue) {
                    counter++;
                }
            }
        }

        return counter == 3;
    }
    public boolean colChecker(int xValue, boolean red)
    {
        int counter = 0;
        if(red) {
            for (int i = 0; i < 3; i++) {

                if (board[i][xValue - 1].isRed) {
                    counter++;
                }
            }
        }
        else {
            for (int i = 0; i < 3; i++) {

                if (board[i][xValue - 1].isBlue) {
                    counter++;
                }
            }
        }

        return counter == 3;


    }
    public boolean diagonalDownChecker(boolean red)
    {
        int counter = 0;
        if(red)
        {
            for(int i = 0; i < redXInd - 1; i++)
            {
                if(redXCount[i] + redYCount[i] == 4)
                {
                    counter++;
                }
            }
        }
        else
        {
            for(int i = 0; i < blueXInd - 1; i++)
            {
                if(blueXCount[i] + blueYCount[i] == 4)
                {
                    counter++;
                }
            }
        }
        return counter==2;
    }
    public boolean diagonalUpChecker(boolean red)
    {
        int counter = 0;
        if(red)
        {
            for(int i = 0; i < redXInd-1; i++)
            {
                if(redXCount[i] == redYCount[i])
                {
                    counter++;
                }
            }
        }
        else
        {
            for(int i = 0; i < blueXInd-1; i++)
            {
                if(blueXCount[i] == blueYCount[i])
                {
                    counter++;
                }
            }
        }
        return counter==2;
    }


}