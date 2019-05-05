package com.akb.ilham.myapplication;

/// Tgl Pengerjaan : 5 April 2019
// Nama : Ilham Prasetyo
// NIM : 10116496
// Kelas : AKB-11

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by Kuncoro on 22/03/2016.
 */
public class ProfileActivity extends Fragment {

    public ProfileActivity() {
    }

    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_profile, container, false);

        getActivity().setTitle("Profile");

       ImageButton  btn_contact = (ImageButton) view.findViewById(R.id.btn_contact);
        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ContactActivity.class);
                startActivity(i);
            }
        });

        ImageButton btn_about = (ImageButton) view.findViewById(R.id.btn_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AboutActivity.class);
                startActivity(i);
            }
        });


        ImageButton btn_map = (ImageButton) view.findViewById(R.id.btn_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/maps/place/Gg.+H.Abdullah.1,+Pasirkaliki,+Cimahi+Utara,+Kota+Cimahi,+Jawa+Barat+40514,+Indonesia/@-6.8889345,107.5711102,18z/data=!3m1!4b1!4m13!1m7!3m6!1s0x2e68e42ad3ab9683:0x7b5f1a91e18cb2f8!2sJl.+Cidamar,+Pasirkaliki,+Cimahi+Utara,+Kota+Cimahi,+Jawa+Barat+40514,+Indonesia!3b1!8m2!3d-6.8882771!4d107.5719079!3m4!1s0x2e68e5d531021127:0xb4ef05aaf7c81f76!8m2!3d-6.8889345!4d107.5722045"));
                startActivity(i);
            }
        });

        return view;
    }
}