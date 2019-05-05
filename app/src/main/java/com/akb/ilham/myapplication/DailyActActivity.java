package com.akb.ilham.myapplication;


// Tgl Pengerjaan : 5 April 2019
// Nama : Ilham Prasetyo
// NIM : 10116496
// Kelas : AKB-11

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DailyActActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DailyAdapter adapter;
    private ArrayList<DailyActActivity_2> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_act);


        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new DailyAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DailyActActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new DailyActActivity_2("Bangun & sholat", "4.30 - 5.00", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Bersih - bersih rumah dan kamar", "5.00 - 6.00", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Antar Adik Sekolah", "6.00 - 7.00", "Kadang"));
        mahasiswaArrayList.add(new DailyActActivity_2("Sarapan", "7.00 - 8.15", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Mandi", "8.15 - 8.40", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Berangkat Kuliah", "9.00 - 11.45", "Kadang"));
        mahasiswaArrayList.add(new DailyActActivity_2("Istirahat Sholat", "11.45 - 12.15", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Kuliah", "12.30 - 15.00", "Kadang"));
        mahasiswaArrayList.add(new DailyActActivity_2("Istirahat Sholat", "15.30 - 16.00", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Internetan", "16.00 - 17.50", "Kadang"));
        mahasiswaArrayList.add(new DailyActActivity_2("Istirahat Sholat", "17.50 - 18.15", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Internetan", "18.15 - 19.10", "Kadanag"));
        mahasiswaArrayList.add(new DailyActActivity_2("Sholat", "19.10 - 19.30", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Makan Malam", "19.30 - 20.00", "Rutin"));
        mahasiswaArrayList.add(new DailyActActivity_2("Internetan", "20.00 - 24.00", "kadang"));
        mahasiswaArrayList.add(new DailyActActivity_2("Tidur", "00.00 - 4.30", "Rutin"));
    }

}

