package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewSuministros extends Activity {

    private WebView webView10;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_suministros);

        webView10 = (WebView) findViewById(R.id.webView);
        webView10.getSettings().setJavaScriptEnabled(true);
        webView10.loadUrl("http://192.168.137.149/cgi-bin/consultadepositos.py");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
    }

}
