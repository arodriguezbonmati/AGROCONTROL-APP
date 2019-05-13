package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Pantalla2 extends Activity {


    public void onCreate(Bundle savedInstanceState) {
        Button button5;
        final Context context = this;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        button5 = findViewById(R.id.button8);

        button5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(context, WebViewVerComederos.class);
                startActivity(intent1);
            }

        });

    }
}
