package com.example.appsgogreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_tumbuhan;
    private ArrayList<Tumbuhan> list = new ArrayList<>();

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_tumbuhan = findViewById(R.id.rvTumbuhan);
        rv_tumbuhan.setHasFixedSize(true);

        list.addAll(DataTumbuhan.getListData());
        ShowRecyclerCardView();

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()){
                    case R.id.nav_beranda:
                        selectedFragment = new BerandaFrag();
                        break;
                    case R.id.nav_web:
                        selectedFragment = new WebFrag();
                        break;
                    case R.id.nav_tentang:
                        selectedFragment = new TentangFrag();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container,selectedFragment).commit();
                return true;
            }

        });

    }

    private void ShowRecyclerCardView() {
        rv_tumbuhan.setLayoutManager(new LinearLayoutManager(this));
        CardViewTumbuhanAdapter cardViewTumbuhanAdapter = new CardViewTumbuhanAdapter(list);
        rv_tumbuhan.setAdapter(cardViewTumbuhanAdapter);

        cardViewTumbuhanAdapter.setOnItemClickCallback(new CardViewTumbuhanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Tumbuhan tumbuhan) {
                Intent move = new Intent(MainActivity.this, DetailActivity.class);
                move.putExtra(DetailActivity.ITEM_EXTRA, tumbuhan);
                startActivity(move);
            }
        });


    }


}
