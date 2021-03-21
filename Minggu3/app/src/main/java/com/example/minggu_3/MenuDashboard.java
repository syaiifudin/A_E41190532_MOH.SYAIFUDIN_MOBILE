package com.example.minggu_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MenuDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dashboard);
    }

    public void pindah1(View view) {
        Intent intent = new Intent(MenuDashboard.this, MainActivity.class);
        startActivity(intent);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(MenuDashboard.this, RelativeLayout.class);
        startActivity(intent);
    }

    public void pindah3(View view) {
        Intent intent = new Intent(MenuDashboard.this, ConstraintLayout.class);
        startActivity(intent);
    }

    public void pindah4(View view) {
        Intent intent = new Intent(MenuDashboard.this, MainActivity.class);
        startActivity(intent);
    }

    public void pindah5(View view) {
        Intent intent = new Intent(MenuDashboard.this, TableLayout.class);
        startActivity(intent);
    }

    public void pindah6(View view) {
        Intent intent = new Intent(MenuDashboard.this, MaterialDesign.class);
        startActivity(intent);
    }

    public void pindah7(View view) {
        Intent intent = new Intent(MenuDashboard.this, ScrollView.class);
        startActivity(intent);
    }

    public void pindah8(View view) {
        Intent intent = new Intent(MenuDashboard.this, ScrollViewHorizontal.class);
        startActivity(intent);
    }

    public void pindah9(View view) {
        Intent intent = new Intent(MenuDashboard.this, FrameLayout.class);
        startActivity(intent);
    }
}