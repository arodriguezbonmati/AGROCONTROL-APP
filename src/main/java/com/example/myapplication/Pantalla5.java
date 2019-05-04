package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button1;
        final Context context = this;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla5);

        button1 = findViewById(R.id.button10);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent1 = new Intent(context, WebViewSuministros.class);
                startActivity(intent1);
            }

        });
    }
}
