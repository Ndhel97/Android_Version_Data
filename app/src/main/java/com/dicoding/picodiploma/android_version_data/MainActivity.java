package com.dicoding.picodiploma.android_version_data;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAndroid;
    private ArrayList<Android> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAndroid = findViewById(R.id.rv_android);
        rvAndroid.setHasFixedSize(true);

        list.addAll(AndroidData.getListData());
        showRecyclerList();

        alertDialog();
    }

    private void showRecyclerList() {
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        ListAndroidAdapter ListAndroidAdapter = new ListAndroidAdapter(list);
        rvAndroid.setAdapter(ListAndroidAdapter);
        ListAndroidAdapter.setOnItemClickCallback(new ListAndroidAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Android data) {
                moveToDetail(data);
            }
        });

    }

    private void moveToDetail(Android data) {
        Intent intent = new Intent(MainActivity.this, AndroidDetailsActivity.class);
        intent.putExtra(AndroidDetailsActivity.EXTRA_NAME, data.getName());
        intent.putExtra(AndroidDetailsActivity.EXTRA_VERSION, data.getVersion());
        intent.putExtra(AndroidDetailsActivity.EXTRA_HOME, data.getHome());
        intent.putExtra(AndroidDetailsActivity.EXTRA_DESCRIPTION, data.getDescription());
        intent.putExtra(AndroidDetailsActivity.EXTRA_INITIAL, data.getInitial());
        intent.putExtra(AndroidDetailsActivity.EXTRA_LATEST, data.getLatest());
        intent.putExtra(AndroidDetailsActivity.EXTRA_PRECEDED, data.getPreceded());
        intent.putExtra(AndroidDetailsActivity.EXTRA_SUCCEEDED, data.getSucceeded());
        intent.putExtra(AndroidDetailsActivity.EXTRA_WEBSITE, data.getWebsite());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_me:
                Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void alertDialog() {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage("You can click any link in this app to automatically open a browser and redirect you to the website.");
        dialog.setTitle("Tips..");
        dialog.setPositiveButton("Okay",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Toast.makeText(getApplicationContext(),"Your welcome...",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }
}