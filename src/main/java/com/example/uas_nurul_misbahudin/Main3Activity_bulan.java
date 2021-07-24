package com.example.uas_nurul_misbahudin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Main3Activity_bulan extends AppCompatActivity {

    private ArrayList<String> fotorumahsakit = new ArrayList<>();
    private ArrayList<String> namarumahsakit = new ArrayList<>();
    private ArrayList<String> namakota = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_bulan);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter1 adapter = new RecyclerViewAdapter1(fotorumahsakit, namarumahsakit,namakota, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
    private  void getDataFromInternet(){

        namakota.add("Bulan Muharram");
        namarumahsakit.add("Kalender Bulan Muharram");
        fotorumahsakit.add("https://3.bp.blogspot.com/-UOFxLiffPWE/XWEM7qVWQGI/AAAAAAAAKts/9rTI3yAN8-4cvwGdW3hwRjvRWE-xVSVQACLcBGAs/s1600/desain-kalender-tahun-2020-cdr-premium.jpg");
        info.add("1. Tahun Baru Islam 1442 H 1 Muharam 1442 H\t20 Agustus 2020\n\n" +
                "2. Puasa Tasu’a 1442 H\t9 Muharam 1442 H\t28 Agustus 2020\n\n" +
                "3. Puasa 'Asyura 1442 H\t10 Muharam 1442 H\t29 Agustus 2020\n\n");

        namakota.add("Bulan Shafar");
        namarumahsakit.add("Kalender Bulan Shafar");
        fotorumahsakit.add("https://3.bp.blogspot.com/-UOFxLiffPWE/XWEM7qVWQGI/AAAAAAAAKts/9rTI3yAN8-4cvwGdW3hwRjvRWE-xVSVQACLcBGAs/s1600/desain-kalender-tahun-2020-cdr-premium.jpg");
        info.add("1.\tAwal Bulan Shafar (1 Shafar 1442 H /18 September 2020)\n\n" +
                "2.\tPuasa Ayyamul Bidh Shafar (13 - 15 Shafar 1442 H /30 September - 2 Oktober 2020\n");

        namakota.add("Bulan Rabiul Awal");
        namarumahsakit.add("Kalender Rabiul Awal");
        fotorumahsakit.add("https://3.bp.blogspot.com/-UOFxLiffPWE/XWEM7qVWQGI/AAAAAAAAKts/9rTI3yAN8-4cvwGdW3hwRjvRWE-xVSVQACLcBGAs/s1600/desain-kalender-tahun-2020-cdr-premium.jpg");
        info.add("1.\tAwal Bulan Rabi'ul-Awal (1 Rabi'ul-Awal 1442 H /18 Oktober 2020)\n\n" +
                "2.\tMaulid Nabi SAW (12 Rabi'ul-Awal 1442 H /29 Oktober 2020)\n\n" +
                "3.\tPuasa Ayyamul Bidh Rabi'ul-Awal (13 - 15 Rabi'ul-Awal 1442 /30 Oktober - 1 November 2020)\n");

        namakota.add("Bulan Rabi'ul-Akhir");
        namarumahsakit.add("Kalender Rabi'ul-Akhir");
        fotorumahsakit.add("https://3.bp.blogspot.com/-UOFxLiffPWE/XWEM7qVWQGI/AAAAAAAAKts/9rTI3yAN8-4cvwGdW3hwRjvRWE-xVSVQACLcBGAs/s1600/desain-kalender-tahun-2020-cdr-premium.jpg");
        info.add("1.\tAwal Bulan Rabi'ul-Akhir (1 Rabi'ul-Akhir 1442 H /16 November 2020)\n\n" +
                "2.\tPuasa Ayyamul Bidh Rabi'ul-Akhir (13 - 15 Rabi'ul-Akhir 1442 H/ 28 - 30 November 2020)\n");

        namakota.add("Bulan Jumadil-Ula");
        namarumahsakit.add("Kalender Jumadil-Ula");
        fotorumahsakit.add("https://3.bp.blogspot.com/-UOFxLiffPWE/XWEM7qVWQGI/AAAAAAAAKts/9rTI3yAN8-4cvwGdW3hwRjvRWE-xVSVQACLcBGAs/s1600/desain-kalender-tahun-2020-cdr-premium.jpg");
        info.add("1. Awal Bulan Jumadil-Ula (1 Jumadil-Ula 1442 H/16 Desember 2020)\n\n" +
                "2. Puasa Ayyamul Bidh Jumadil-Ula ( 13 - 15 Jumadil-Ula 1442 H/28 - 30 Desember 2020).\n" +
                "\n");











        prosesRecyclerViewAdapter();

    }

}