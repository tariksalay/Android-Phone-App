package com.example.umpirelab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int countBall = 0;
    private int countStrike = 0;
    private TextView ballView;
    private TextView strikeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ballClicked(View view) {
        countBall++;
        if(countBall < 5){
            ballView.setText(String.valueOf(countBall));

        }else{
            ballView.setText("Walk!");
        }
    }

    public void strikeClicked(View view) {
        countStrike++;
        if (countStrike < 4){
            strikeView.setText(String.valueOf(countStrike));
        }else{
            strikeView.setText("Out!");
        }
    }
}
