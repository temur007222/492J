package com.example.a492j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

   void initViews(){
        imageView = findViewById(R.id.iv_image);
       Button button = findViewById(R.id.b_button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.sequential);
               imageView.startAnimation(animation);
           }
       });
    }
}