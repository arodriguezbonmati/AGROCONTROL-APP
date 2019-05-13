package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewMedio extends Activity {

    private WebView webView2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_medio);

        webView2 = (WebView) findViewById(R.id.webView);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.loadUrl("http://192.168.137.149/cgi-bin/compuertas2.py");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
        //
    }

}