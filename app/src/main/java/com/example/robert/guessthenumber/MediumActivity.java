package com.example.robert.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MediumActivity extends AppCompatActivity {

    int guess;
    String guessing = "";
    int guesses = 5;
    int rando = ((int)(Math.random() * 100 + 1));

    public void ButtonOnClick1(View I){
        guessing += "1";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick2(View II){
        guessing += "2";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick3(View III){
        guessing += "3";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick4(View IIII){
        guessing += "4";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick5(View V){
        guessing += "5";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick6(View VI){
        guessing += "6";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick7(View VII){
        guessing += "7";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick8(View VIII){
        guessing += "8";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick9(View IX){
        guessing += "9";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick10(View X){
        guessing += "0";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick11(View XI){
        guessing = "";
        TextView guessField = (TextView)findViewById(R.id.guessField);
        guessField.setText(guessing);
    }

    public void ButtonOnClick12(View XII){
        guess = Integer.parseInt(guessing);

        if (guesses > 0) {
            if (guess == rando) {
                guesses = 0;
                TextView guessesField = (TextView) findViewById(R.id.guessesField);
                guessesField.setText("" + guesses);
                TextView resultField = (TextView) findViewById(R.id.resultField);
                resultField.setText("Congratulations!");
                guessing = "";
                TextView guessField = (TextView)findViewById(R.id.guessField);
                guessField.setText(guessing);
            } else if (guess < rando) {
                guesses--;
                TextView guessesField = (TextView) findViewById(R.id.guessesField);
                guessesField.setText("" + guesses);
                TextView resultField = (TextView) findViewById(R.id.resultField);
                resultField.setText("The answer is higher!");
                guessing = "";
                TextView guessField = (TextView)findViewById(R.id.guessField);
                guessField.setText(guessing);
            } else if (guess > rando) {
                guesses--;
                TextView guessesField = (TextView) findViewById(R.id.guessesField);
                guessesField.setText("" + guesses);
                TextView resultField = (TextView) findViewById(R.id.resultField);
                resultField.setText("The answer is lower!");
                guessing = "";
                TextView guessField = (TextView)findViewById(R.id.guessField);
                guessField.setText(guessing);
            }

            if (guesses == 0 && guess != rando) {
                TextView resultField = (TextView) findViewById(R.id.resultField);
                resultField.setText("Sorry, the answer was: " + rando);
                guessing = "";
                TextView guessField = (TextView)findViewById(R.id.guessField);
                guessField.setText(guessing);
            }
        }
        else
            return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }
}
