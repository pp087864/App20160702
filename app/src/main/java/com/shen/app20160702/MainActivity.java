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
    private ImageView imageView, imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        //imageview變數對應
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);

        //Picasso從網路抓取圖片並載入imageview
        Picasso.with(context).load("https://cdn.free.com.tw/blog/wp-content/uploads/2014/08/Placekitten480-g.jpg").into(imageView);
        Picasso.with(context).load("http://img05.tooopen.com/images/20150925/tooopen_sy_143684733881.jpg").into(imageView2);

    }
    /**
     * onClick有兩種方法:
     *  方法一:寫多個onClick來區分
     *  方法二:單一onClick寫switch抓取圖片id值，點到哪個就載入哪個
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView:
                //Toast快顯
                //Toast.makeText(場景 , 顯示 , 顯示長或短時間).show();
                Toast.makeText(context, "我是GitHub初學者!!", Toast.LENGTH_SHORT).show();

                //單一震動
                ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(1000);

                break;
            case R.id.imageView2:
                //Toast快顯
                //Toast.makeText(場景 , 顯示 , 顯示長或短時間).show();
                Toast.makeText(context, "我是GitHub初學者2!!", Toast.LENGTH_SHORT).show();

                //重複震動
                //訂定震一次的循環
                long[] flow = {0, 100, 1000, 200, 1000, 300, 1000, 400};
                //vibrate(傳入long陣列 , 重複次數，一次就好為-1)
                ((Vibrator) getSystemService(VIBRATOR_SERVICE)).vibrate(flow, -1);

                break;
        }

    }

}
