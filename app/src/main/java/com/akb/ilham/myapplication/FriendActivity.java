package com.akb.ilham.myapplication;

// Tgl Pengerjaan : 5 April 2019
// Nama : Ilham Prasetyo
// NIM : 10116496
// Kelas : AKB-11

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FriendActivity extends AppCompatActivity {
    private List<Grocery> groceryList = new ArrayList<>();
    private RecyclerView groceryRecyclerView;
    private RecyclerViewHorizontalListAdapter groceryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        groceryRecyclerView = findViewById(R.id.idRecyclerViewHorizontalList);
        // add a divider after each item for more clarity
        groceryRecyclerView.addItemDecoration(new DividerItemDecoration(FriendActivity.this, LinearLayoutManager.HORIZONTAL));
        groceryAdapter = new RecyclerViewHorizontalListAdapter(groceryList, getApplicationContext());
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(FriendActivity.this, LinearLayoutManager.HORIZONTAL, false);
        groceryRecyclerView.setLayoutManager(horizontalLayoutManager);
        groceryRecyclerView.setAdapter(groceryAdapter);
        populategroceryList();
    }

    private void populategroceryList() {
        Grocery grizzly = new Grocery("Grizzly", R.drawable.grizzly);
        Grocery panda = new Grocery("Panda", R.drawable.panda);
        Grocery ice = new Grocery("Ice Bear", R.drawable.ice);
        groceryList.add(grizzly);
        groceryList.add(panda);
        groceryList.add(ice);
        groceryAdapter.notifyDataSetChanged();
    }
}
