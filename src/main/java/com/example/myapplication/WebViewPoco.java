package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewPoco extends Activity {

    private WebView webView1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_poco);

        webView1 = (WebView) findViewById(R.id.webView);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.loadUrl("http://laspaginasverdes.com/login/");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
    }

}