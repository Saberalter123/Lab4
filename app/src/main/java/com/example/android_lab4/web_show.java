package com.example.android_lab4;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class web_show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_show);
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("https://baidu.com");
    }
}
