package com.akb.ilham.myapplication;

/// Tgl Pengerjaan : 5 April 2019
// Nama : Ilham Prasetyo
// NIM : 10116496
// Kelas : AKB-11

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageButton btn_insta = (ImageButton) findViewById(R.id.btn_insta);
        btn_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.instagram.com/il.prasetyo/"));
                startActivity(i);
            }
        });

        ImageButton btn_facebook = (ImageButton) findViewById(R.id.btn_facebook);
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.facebook.com/ilham.prasetyo.79"));
                startActivity(i);
            }
        });

        ImageButton btn_twitter = (ImageButton) findViewById(R.id.btn_twitter);
        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/ilpras"));
                startActivity(i);
            }
        });

        ImageButton btn_pinterest = (ImageButton) findViewById(R.id.btn_pinterest);
        btn_pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://id.pinterest.com/ilprasetyo2125/"));
                startActivity(i);
            }
        });

    }
}
