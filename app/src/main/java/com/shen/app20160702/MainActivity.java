package com.shen.app20160702;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(context).load("https://cdn.free.com.tw/blog/wp-content/uploads/2014/08/Placekitten480-g.jpg").into(imageView);

    }
}
