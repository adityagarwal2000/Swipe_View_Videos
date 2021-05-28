package com.example.android.swipeview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private String name, title, desc;
    private TextView nameT, titleT, descT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        name = intent.getStringExtra("accName");
        title = intent.getStringExtra("accTitle");
        desc = intent.getStringExtra("accDesc");
        nameT = findViewById(R.id.uploader_name);
        titleT = findViewById(R.id.uploader_title);
        descT = findViewById(R.id.uploader_desc);
        nameT.setText("Uploader:\n" + name);
        titleT.setText("Video Title:\n" + title);
        descT.setText("Description:\n" + desc);
    }
}