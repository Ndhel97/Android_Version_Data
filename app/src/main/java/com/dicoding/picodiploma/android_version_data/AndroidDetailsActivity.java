package com.dicoding.picodiploma.android_version_data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AndroidDetailsActivity extends AppCompatActivity {
    public static String EXTRA_NAME = "android_name";
    public static String EXTRA_VERSION = "android_version";
    public static String EXTRA_HOME = "android_home";
    public static String EXTRA_DESCRIPTION = "android_description";
    public static String EXTRA_INITIAL = "android_initial";
    public static String EXTRA_LATEST = "android_latest";
    public static String EXTRA_PRECEDED = "android_preceded";
    public static String EXTRA_SUCCEEDED = "android_succeeded";
    public static String EXTRA_WEBSITE = "android_website";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_details);

        ImageView androidHome = findViewById(R.id.home_android);
        TextView androidName = findViewById(R.id.name_ver_android);
        TextView androidVersion = findViewById(R.id.ver_android);
        TextView androidDescription = findViewById(R.id.desc_android);
        TextView androidInitial = findViewById(R.id.init_android);
        TextView androidLatest = findViewById(R.id.lat_android);
        TextView androidPreceded = findViewById(R.id.pre_android);
        TextView androidSucceeded = findViewById(R.id.suc_android);
        TextView androidWebsite = findViewById(R.id.web_android);

//        Glide.with(this).load(getIntent().getStringExtra(EXTRA_HOME)).into(androidHome);
        Glide.with(this).load(getResources().getIdentifier(getIntent().getStringExtra(EXTRA_HOME), "drawable", "com.dicoding.picodiploma.android_version_data")).into(androidHome);
        androidName.setText(getIntent().getStringExtra(EXTRA_NAME));
        androidVersion.setText(getIntent().getStringExtra(EXTRA_VERSION));
        androidDescription.setText(getIntent().getStringExtra(EXTRA_DESCRIPTION));
        androidInitial.setText(getIntent().getStringExtra(EXTRA_INITIAL));
        androidLatest.setText(getIntent().getStringExtra(EXTRA_LATEST));
        androidPreceded.setText(getIntent().getStringExtra(EXTRA_PRECEDED));
        androidSucceeded.setText(getIntent().getStringExtra(EXTRA_SUCCEEDED));
        androidWebsite.setText(getIntent().getStringExtra(EXTRA_WEBSITE));

        Linkify.addLinks(androidWebsite, Linkify.ALL);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_NAME) + "Version Details");
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}