package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import org.apache.http.client.HttpClient;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //OkHttpClient client = new OkHttpClient();//añadi esto y las lineas de abajo, hasta button no se que
        //String url = "http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123";

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantalla2();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantalla3();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantalla4();
            }
        });

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPantalla5();
            }
        });

    }

    public void openPantalla2( ){
        Intent intent = new Intent (this, Pantalla2.class);
        startActivity(intent);
    }

    public void openPantalla3( ){
        Intent intent = new Intent (this, Pantalla3.class);
        startActivity(intent);
    }

    public void openPantalla4( ){
        Intent intent = new Intent (this, Pantalla4.class);
        startActivity(intent);
    }

    public void openPantalla5( ){
        Intent intent = new Intent (this, Pantalla5.class);
        startActivity(intent);
    }

}
