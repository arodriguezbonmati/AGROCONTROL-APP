package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pantalla3 extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        Button button1;
        final Context context = this;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);

        button1 = findViewById(R.id.button4);

        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(context, WebViewPoco.class);
                startActivity(intent1);
            }

        });
        Button button2;
        final Context context2 = this;

        button2 = findViewById(R.id.button5);

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent2 = new Intent(context2, WebViewMedio.class);
                startActivity(intent2);
            }

        });
        Button button3;
        final Context context3 = this;

        button3 = findViewById(R.id.button6);

        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent3 = new Intent(context3, WebViewMucho.class);
                startActivity(intent3);
            }

        });

    }

}
