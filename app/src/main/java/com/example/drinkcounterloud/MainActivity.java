package com.example.drinkcounterloud;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int counter = 0;
    private int counter1 = 0;
    private int money =0;

    private TextView countertxtview;
    private TextView countermoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);



        countertxtview = (TextView)findViewById(R.id.countertxtview);
        countermoney = (TextView)findViewById(R.id.countermoney);

    }


    public void plusshot (View view){
        counter1 = counter;
        counter = counter +2 ;
        money = counter*20/100;
        countertxtview.setText(String.valueOf(counter));
        countermoney.setText(String.valueOf(money));
    }

    public void plusbeer (View view){
        counter1 = counter;
        counter = counter +3 ;
        money = counter*20/100;
        countertxtview.setText(String.valueOf(counter));
        countermoney.setText(String.valueOf(money));
    }

    public void plusdrink (View view){
        counter1 = counter;
        counter = counter +5 ;
        money = counter*20/100;
        countertxtview.setText(String.valueOf(counter));
        countermoney.setText(String.valueOf(money));
    }


    public void undo (View view){
        countertxtview.setText(String.valueOf(counter1));
        counter = counter1;
        money = counter*20/100;
        countermoney.setText(String.valueOf(money));

    }

}
