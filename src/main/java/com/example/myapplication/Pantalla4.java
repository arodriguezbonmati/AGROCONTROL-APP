package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button1;
        final Context context = this;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla4);

        button1 = findViewById(R.id.button11);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(context, WebView1Hora.class);
                startActivity(intent1);
            }

        });
        Button button2;
        final Context context2 = this;

        button2 = findViewById(R.id.button12);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent2 = new Intent(context2, WebView2Horas.class);
                startActivity(intent2);
            }

        });
        Button button3;
        final Context context3 = this;

        button3 = findViewById(R.id.button13);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent3 = new Intent(context3, WebView3Horas.class);
                startActivity(intent3);
            }

        });

    }
}
