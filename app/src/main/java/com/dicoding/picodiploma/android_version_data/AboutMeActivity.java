package com.dicoding.picodiploma.android_version_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("About Me...");
        }

        TextView tvLinkify_1 = (TextView) findViewById(R.id.source);
        TextView tvLinkify_2 = (TextView) findViewById(R.id.github);
        Linkify.addLinks(tvLinkify_1, Linkify.ALL);
        Linkify.addLinks(tvLinkify_2, Linkify.ALL);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}