package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewVerComederos extends Activity {

    private WebView webView4;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_ver_comederos);

        webView4 = (WebView) findViewById(R.id.webView);
        webView4.getSettings().setJavaScriptEnabled(true);
        webView4.loadUrl("http://www.totaljerkface.com/happy_wheels.tjf");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
    }

}