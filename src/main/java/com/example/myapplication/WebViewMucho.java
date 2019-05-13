package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewMucho extends Activity {

    private WebView webView3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_mucho);

        webView3 = (WebView) findViewById(R.id.webView);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.loadUrl("http://192.168.137.149/cgi-bin/compuertas3.py");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
    }

}