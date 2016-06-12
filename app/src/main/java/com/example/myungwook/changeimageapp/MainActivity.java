package com.example.myungwook.changeimageapp;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.myungwook.changeimageapp.R;

public class MainActivity extends AppCompatActivity {
    BitmapDrawable bitmap;
    int imageindex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton(View v){
        changeImage();
    }
    public void changeImage(){
        ImageView imgView = (ImageView)findViewById(R.id.imageView);
        ImageView imgView2 = (ImageView)findViewById(R.id.imageView2);
        if(imageindex==0) {
            imgView.setImageResource(R.drawable.image02);
            imgView2.setImageResource(R.drawable.image01);
            imageindex = 1;
        }
        else if(imageindex==1) {
            imgView.setImageResource(R.drawable.image01);
            imgView2.setImageResource(R.drawable.image02);
            imageindex = 0;
        }
    }
}
