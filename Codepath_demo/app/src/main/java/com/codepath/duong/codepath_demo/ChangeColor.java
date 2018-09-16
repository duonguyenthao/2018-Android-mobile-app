package com.codepath.duong.codepath_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.codepath.duong.codepath_demo.R.layout.activity_main;

public class ChangeColor extends Activity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(activity_main);
        final Button button = (Button) findViewById(R.id.mbutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v){
                Log.d("button_clicked","Clicked");
                TextView textElement = (TextView) findViewById(R.id.textLable);
                textElement.setTextColor(0xFF00FF00); //this is green color

            }
        });
    }

}