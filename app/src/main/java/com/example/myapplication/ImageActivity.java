package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButton1, radioButton2, radioButton3;

    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        radioButton1=findViewById(R.id.bird);
        radioButton2=findViewById(R.id.tiger);
        radioButton3=findViewById(R.id.snake);

        imageview=findViewById(R.id.ivshowing);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bird:
            imageview.setImageResource(R.drawable.bird);
            break;

            case R.id.tiger:
                imageview.setImageResource(R.drawable.tiger);
                break;

            case R.id.snake:
                imageview.setImageResource(R.drawable.snake);
                break;
        }
    }
}
