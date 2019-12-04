package com.example.umpirebuddy;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int countBall = 0;
    private int countStrike = 0;
    TextView BallView;
    TextView StrikeView;

    private void alertView(String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BallView = (TextView) findViewById(R.id.BallView);
        StrikeView = (TextView) findViewById(R.id.StrikeView);
    }

    public void ballClicked(View view) {
        countBall++;
        if (countBall < 4) {
            BallView.setText("Ball: " + countBall);

        } else {
            alertView("Walk!!");
            countBall = 0;
            countStrike = 0;
            BallView.setText("Ball: " + countBall);
            StrikeView.setText("Strike: " + countStrike);
        }
    }

    public void strikeClicked(View view) {
        countStrike++;
        if (countStrike < 3) {
            StrikeView.setText("Strike: " + countStrike);
        } else {
            alertView("Out!!");
            countBall = 0;
            countStrike = 0;
            BallView.setText("Ball: " + countBall);
            StrikeView.setText("Strike: " + countStrike);


        }

    }
}
