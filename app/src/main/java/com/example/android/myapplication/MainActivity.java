package com.example.android.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        TextView textMessage = (TextView) findViewById(R.id.status_text_view);
        textMessage.setText("I'm so full");

        ImageView imageMessage = (ImageView) findViewById(R.id.android_cookie_image_view);
        imageMessage.setImageResource(R.drawable.after_cookie);
    }
}