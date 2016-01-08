package com.example.fahad.htmlfaqs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class URLViewerActivity extends AppCompatActivity {


    private static WebView url_webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url_input");
        String title = intent.getStringExtra("url_title_input");


        init_html_screen(url, title);
    }

    public void init_html_screen(String arg_url, String arg_title) {

        this.setTitle(arg_title);

        url_webview = (WebView)findViewById(R.id.id_wv);

        url_webview.getSettings().setLoadsImagesAutomatically(true);
        url_webview.getSettings().setJavaScriptEnabled(true);
        url_webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        url_webview.setWebViewClient(new WebViewClient());
        url_webview.loadUrl(arg_url);
    }

}
