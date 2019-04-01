package com.example.imageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton rboHulk, rboBatman, rboJoker;
    private ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rboBatman = findViewById(R.id.rboBatman);
        rboJoker = findViewById(R.id.rboJoker);
        rboHulk = findViewById(R.id.rboHulk);
        ivImage = findViewById(R.id.ivImage);

        rboHulk.setOnClickListener(this);
        rboBatman.setOnClickListener(this);
        rboJoker.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rboBatman:
                ivImage.setImageResource(R.drawable.batman);
                Toast.makeText(this, "I'm Batman.", Toast.LENGTH_LONG).show();
                break;
            case R.id.rboJoker:
                ivImage.setImageResource(R.drawable.joker);
                Toast.makeText(this, "Hello, I'm Joker.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rboHulk:
                ivImage.setImageResource(R.drawable.hulk);
                Toast.makeText(this, "You won't like me GREEN.", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
