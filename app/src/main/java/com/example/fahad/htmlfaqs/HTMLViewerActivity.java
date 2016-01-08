package com.example.fahad.htmlfaqs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HTMLViewerActivity extends AppCompatActivity {

    public static WebView html_webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent_2 = getIntent();
        String html = intent_2.getStringExtra("html_input");
        String html_title = intent_2.getStringExtra("html_title_input");


        init_html_page(html, html_title);

    }

    public void init_html_page(String arg_html, String arg_title) {

        setTitle(arg_title);

        html_webview = (WebView) findViewById(R.id.id_webview_2);
        html_webview.getSettings().setLoadsImagesAutomatically(true);
        html_webview.getSettings().setJavaScriptEnabled(true);
        html_webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        html_webview.setWebViewClient(new WebViewClient());
        html_webview.loadUrl(arg_html);
    }

}
