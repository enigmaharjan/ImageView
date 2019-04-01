package com.example.imageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

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



    }




    @Override
    public void onClick(View v) {

    }
}
