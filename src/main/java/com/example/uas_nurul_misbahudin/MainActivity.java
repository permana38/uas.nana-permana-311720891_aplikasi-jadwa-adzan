package com.example.uas_nurul_misbahudin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton button1,button2,button3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(ImageButton)findViewById(R.id.button1);
        button2=(ImageButton)findViewById(R.id.button2);
        button3=(ImageButton)findViewById(R.id.button3);


        ImageButton imageButton = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton1 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Main3Activity_bulan.class);
                startActivity(activity2Intent);
            }
        });

        ImageButton imageButton2 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Main3Activity_doa.class);
                startActivity(activity2Intent);
            }
        });






    }
}
