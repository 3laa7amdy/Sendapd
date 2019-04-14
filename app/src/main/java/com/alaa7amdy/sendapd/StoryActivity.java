package com.alaa7amdy.sendapd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class StoryActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        webView = (WebView)findViewById(R.id.webview);

        Intent data = getIntent();
        int index = data.getIntExtra("index", -1);
        index++;
        webView.loadUrl("file:///android_asset/html/"+index+".html");

        //webView.set

    }
}
