package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView3Horas extends Activity {

    private WebView webView23;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view3_horas);

        webView23 = (WebView) findViewById(R.id.webView);
        webView23.getSettings().setJavaScriptEnabled(true);
        webView23.loadUrl("http://laspaginasverdes.com/login/");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
        //
    }

}