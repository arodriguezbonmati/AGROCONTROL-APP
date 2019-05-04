package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewVerBebederos extends Activity {

    private WebView webView5;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_ver_bebederos);

        webView5 = (WebView) findViewById(R.id.webView);
        webView5.getSettings().setJavaScriptEnabled(true);
        webView5.loadUrl("http://laspaginasverdes.com/login/");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
    }

}