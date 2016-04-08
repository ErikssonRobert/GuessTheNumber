package com.example.robert.guessthenumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button easy = (Button)this.findViewById(R.id.easyButton);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EasyActivity.class);
                startActivity(i);
            }
        });

        Button medium = (Button)this.findViewById(R.id.mediumButton);
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, MediumActivity.class);
                startActivity(j);
            }
        });

        Button hard = (Button)this.findViewById(R.id.hardButton);
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, HardActivity.class);
                startActivity(k);
            }
        });
    }
}
