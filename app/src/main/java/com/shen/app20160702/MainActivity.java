package com.shen.app20160702;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    //宣告場景資訊
    private Context context;
    //宣告ImageView
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageView = (ImageView) findViewById(R.id.imageView);
        //Picasso載入網路圖片

        Picasso.with(context).load("https://cdn.free.com.tw/blog/wp-content/uploads/2014/08/Placekitten480-g.jpg").into(imageView);

    }

    public void onClick(View view) {
        //Toast快顯
        //Toast.makeText(場景 , 顯示 , 顯示長或短時間).show();
        Toast.makeText(context , "我是GitHub初學者!!" , Toast.LENGTH_SHORT).show();

        //單一震動
        //((Vibrator)getSystemService(VIBRATOR_SERVICE)).vibrate(1000);

        //重複震動
        //訂定震一次的循環
        long[] flow ={0 , 100 , 1000 , 200 , 1000 , 300 , 1000 , 400};
        //vibrate(傳入long陣列 , 重複次數，一次就好為-1)
        ((Vibrator)getSystemService(VIBRATOR_SERVICE)).vibrate(flow , -1);
    }

}
