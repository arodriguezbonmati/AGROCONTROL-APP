package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView1Hora extends Activity {

    private WebView webView20;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1_hora);

        webView20 = (WebView) findViewById(R.id.webView);
        webView20.getSettings().setJavaScriptEnabled(true);
        webView20.loadUrl("http://192.168.137.149/cgi-bin/timercompuertas.py");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
        //
    }

}