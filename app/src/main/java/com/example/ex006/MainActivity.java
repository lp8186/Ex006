package com.example.ex006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btn;
    ImageView iv;
    int num=0;
    Random rnd= new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (ImageButton) findViewById(R.id.btn);
        iv= (ImageView) findViewById(R.id.iv);
    }

    public void push(View view) {
        num= rnd.nextInt(3)+1;
        if (num==1){
            btn.setImageResource(R.drawable.oneone);
            iv.setImageResource(R.drawable.fire1);
        }
        else if (num==2){
            btn.setImageResource(R.drawable.twotwo);
            iv.setImageResource(R.drawable.fire2);
        }
        else {
            btn.setImageResource(R.drawable.threethree);
            iv.setImageResource(R.drawable.fire3);
        }
    }
}
