package com.na.e_blood;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class ScrollingActivity extends AppCompatActivity implements View.OnClickListener{
    CardView card_search;
    CardView card_information;
    CardView card_setting;
    CardView card_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ScrollingActivity.this, SplashActivity.class);
                startActivity(intent);
                finish();
            },SPLASH_TIME_OUT);
        });*/
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cardViewInitializer();

    }
    public void cardViewInitializer(){
        card_search = (CardView) findViewById(R.id.card_search);
        card_search.setOnClickListener(this);
        card_information = (CardView) findViewById(R.id.card_information);
        card_information.setOnClickListener(this);
        card_setting = (CardView) findViewById(R.id.card_setting);
        card_setting.setOnClickListener(this);
        card_about = (CardView) findViewById(R.id.card_about);
        card_about.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.card_search){
            Intent intent = new Intent(ScrollingActivity.this, SearchActivity.class);
            startActivity(intent);
        }else if(v.getId()== R.id.card_information){
            Intent intent = new Intent(ScrollingActivity.this, InformationActivity.class);
            startActivity(intent);
        }else if(v.getId()== R.id.card_setting){

        }else if(v.getId()== R.id.card_about){
            Intent intent = new Intent(ScrollingActivity.this, AboutActivity.class);
            startActivity(intent);
        }

    }
}

