package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView2Horas extends Activity {

    private WebView webView22;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2_horas);

        webView22 = (WebView) findViewById(R.id.webView);
        webView22.getSettings().setJavaScriptEnabled(true);
        webView22.loadUrl("http://192.168.137.149/cgi-bin/timercompuertas2.py");
        //http://192.168.137.149/cgi-bin/test.py?input_parameter_1=123
        //
    }

}
