package com.example.uas_nurul_misbahudin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageview;
    TextView rumahsakit, info1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageview = findViewById(R.id.imageviewfoto);
        rumahsakit = findViewById(R.id.nama);
        info1 = findViewById(R.id.info);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_rumahsakit") && getIntent().hasExtra("nama_rumahsakit") && getIntent().hasExtra("info")){

            String fotorumahsakit = getIntent().getStringExtra("foto_rumahsakit");
            String namarumahsakit = getIntent().getStringExtra("nama_rumahsakit");
            String info = getIntent().getStringExtra("info");


            setDataActivity(fotorumahsakit, namarumahsakit, info);

        }
    }

    private void setDataActivity(String fotorumahsakit, String namarumahsakit, String info){


        Glide.with(this).asBitmap().load(fotorumahsakit).into(imageview);
        rumahsakit.setText(namarumahsakit);
        info1.setText(info);







    }

}
