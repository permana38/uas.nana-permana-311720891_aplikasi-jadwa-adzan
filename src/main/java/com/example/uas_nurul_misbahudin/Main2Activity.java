package com.example.uas_nurul_misbahudin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<String> fotorumahsakit = new ArrayList<>();
    private ArrayList<String> namarumahsakit = new ArrayList<>();
    private ArrayList<String> namakota = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotorumahsakit, namarumahsakit,namakota, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namakota.add("JAKARTA");
        namarumahsakit.add("Masjid Istiqlal");
        fotorumahsakit.add("https://img.gesuri.id/img/content/2019/07/02/40157/masjid-istiqlal-persembahan-bung-karno-bagi-dunia-islam-QUNqVWOYPq.jpg");
        info.add("1.\tImsak: 4.25 WIB\n" +
                "2.\tSubuh: 4.35 WIB\n" +
                "3.\tDhuhur: 11.53 WIB\n" +
                "4.\tAshar: 15.13 WIB\n" +
                "5.\tMagrib: 17.49 WIB\n" +
                "6.\tIsya : 18.59 WIB\n");

        namakota.add("SURABAYA");
        namarumahsakit.add("AL-AKBAR");
        fotorumahsakit.add("https://cdn.idntimes.com/content-images/community/2018/10/372masjid-al-akbar-surabaya-3cf8cade815c24c7b2bae2b70ae87c97_600x400.jpg");
        info.add("1.\tImsak: 4.45 WIB\n" +
                "2.\tSubuh: 4.35 WIB\n" +
                "3.\tDhuhur: 11.53 WIB\n" +
                "4.\tAshar: 15.13 WIB\n" +
                "5.\tMagrib: 17.49 WIB\n" +
                "6.\tIsya : 18.59 WIB\n");

        namakota.add("MEDAN");
        namarumahsakit.add("Medan Raya");
        fotorumahsakit.add("https://media.beritagar.id/2016-06/b0764d7ceea585c109fb6e9aeff95382.jpg");
        info.add("1.\tImsak: 3.50 WIB\n" +
                "2.\tSubuh: 4.35 WIB\n" +
                "3.\tDhuhur: 11.53 WIB\n" +
                "4.\tAshar: 15.13 WIB\n" +
                "5.\tMagrib: 17.49 WIB\n" +
                "6.\tIsya : 18.59 WIB\n");

        namakota.add("BEKASI");
        namarumahsakit.add("AL-AZZAR");
        fotorumahsakit.add("https://infobekasi.co.id/wp-content/uploads/2015/06/IMG_8710.jpg");
        info.add("1.\tImsak: 4.20 WIB\n" +
                "2.\tSubuh: 4.35 WIB\n" +
                "3.\tDhuhur: 11.53 WIB\n" +
                "4.\tAshar: 15.13 WIB\n" +
                "5.\tMagrib: 17.49 WIB\n" +
                "6.\tIsya : 18.59 WIB\n");









        prosesRecyclerViewAdapter();

    }
}