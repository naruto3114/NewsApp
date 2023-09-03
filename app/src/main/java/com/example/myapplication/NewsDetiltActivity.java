package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewsDetiltActivity extends AppCompatActivity {

     String  title,content,disc,url,img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detilt);
        title = getIntent().getStringExtra("title");
       disc = getIntent().getStringExtra("disc");
        content = getIntent().getStringExtra("content");
        img = getIntent().getStringExtra("img");
        url = getIntent().getStringExtra("url");

    }
}