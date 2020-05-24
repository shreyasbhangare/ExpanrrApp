package com.example.expanrr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ImageView Insta;
    ImageView Tweet;
    ImageView Linkedin;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<Integer> array_image = new ArrayList<Integer>();

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getImages();
        Linkedin=findViewById(R.id.linkedin);
        Tweet=findViewById(R.id.tweet);
        Insta=(ImageView)findViewById(R.id.insta);
        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolbar);
        navigationView=findViewById(R.id.navigationview);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        Tweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=" + "Expanrrmedia")));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/#!/" + "Expanrrmedia")));
                }
            }
        });

        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String profile_url = "https://www.linkedin.com/company/expanrr";
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url));
                    intent.setPackage("com.linkedin.android");
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                } catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(profile_url)));
                }
            }
        });


        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://instagram.com/_u/expanrr");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/expanrr")));
                }
            }
        });

    }

    @SuppressLint("ResourceType")
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //super.onBackPressed();
                        //Or used finish();
                        finishAffinity();
                        System.exit(0);
                    }

                })
                .setNegativeButton("No", null)
                .show();

    }

    private void getImages() {
        mNames.add("click here -> This digital platform is bridging the academy – industry gap by delivering industrial skills in demand");
        array_image.add(R.drawable.img1);
        mNames.add("click here-> 5 tips to make work from home effective during Covid-19");
        array_image.add(R.drawable.img2);
        mNames.add("click here-> Fintechs are the big leagues now! How to start one in India?");
        array_image.add(R.drawable.img3);

        initRecyclerView();
    }

    private void initRecyclerView()
    {
        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,array_image);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.LorR:
                startActivity(new Intent(MainActivity.this,LoginOrRegister.class));
                break;
            case R.id.contact:
                startActivity(new Intent(MainActivity.this,ConUs.class));
                break;
            case R.id.about:
                startActivity(new Intent(MainActivity.this,AboutUs.class));
                break;
            case R.id.exit:
                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Exit")
                        .setMessage("Are you sure you want to exit?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //super.onBackPressed();
                                //Or used finish();
                                finishAffinity();
                                System.exit(0);
                            }

                        })
                        .setNegativeButton("No", null)
                        .show();
                break;


        }
        return false;
    }
}
