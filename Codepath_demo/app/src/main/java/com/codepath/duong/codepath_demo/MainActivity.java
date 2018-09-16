package com.codepath.duong.codepath_demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the textview object.
        final TextView textView = (TextView)findViewById(R.id.textLable);

        // Get set text view foreground color button and make button text as normal.
        Button setForeGroundColorButton = (Button)findViewById(R.id.mbutton);
        setForeGroundColorButton.setAllCaps(false);
        setForeGroundColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.GREEN);
            }
        });


    }
}

