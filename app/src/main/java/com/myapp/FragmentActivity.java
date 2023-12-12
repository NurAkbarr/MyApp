package com.myapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        // Inisialisasi BottomNavigationView
        bottomNavigationView = findViewById(R.id.bottomNavigation);

        // Menangani item yang diklik pada BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.menu_home) {
                    loadFragment(new HomeFragment());
                    return true;
                } else if (item.getItemId() == R.id.menu_maps) {
                    loadFragment(new MapsFragment());
                    return true;
                } else if (item.getItemId() == R.id.menu_bioskop) {
                    loadFragment(new BioskopFragment());
                    return true;
                }
                return false;
            }
        });

        // Menampilkan fragment pertama kali (misalnya HomeFragment)
        loadFragment(new HomeFragment());
    }

    private void loadFragment(Fragment fragment) {
        if (!isFinishing()) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
            transaction.replace(R.id.container_layout, fragment);
            transaction.commitAllowingStateLoss();
        }
    }



    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
