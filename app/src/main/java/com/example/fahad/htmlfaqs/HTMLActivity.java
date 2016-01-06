package com.example.fahad.htmlfaqs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HTMLActivity extends AppCompatActivity {


    private static WebView browser;
    private static String url = "http://youtube.com";
    private static String title = "FAQs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        browser = (WebView)findViewById(R.id.id_wv);
        init_html_screen(url, title);
    }

    public void init_html_screen(String arg_url, String arg_title) {

        this.setTitle(title);

        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl(url);
    }

}