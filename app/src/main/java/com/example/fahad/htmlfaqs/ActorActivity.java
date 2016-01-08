package com.example.fahad.htmlfaqs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class ActorActivity extends AppCompatActivity {

    public static Button invoke_URL_btn;
    public static Button invoke_HTML_btn;
    public static EditText url_input;
    public static EditText url_title_input;
    public static EditText html_input;
    public static EditText html_title_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Actor Screen");

        invokeURLpage();

        invokeHTMLpage();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void invokeURLpage() {

        invoke_URL_btn = (Button) findViewById(R.id.id_faqbtn);
        url_input = (   EditText) findViewById(R.id.id_url_textfield);
        url_title_input = (EditText) findViewById(R.id.id_title_textfield);

        invoke_URL_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ActorActivity.this, URLViewerActivity.class);

                i.putExtra("url_input", url_input.getText().toString());
                i.putExtra("url_title_input", url_title_input.getText().toString());

                startActivity(i);
            }
        });
    }

    public void invokeHTMLpage() {


        invoke_HTML_btn = (Button) findViewById(R.id.id_btn_to_3rd_screen);
        html_title_input = (EditText) findViewById(R.id.id_title_html_page);
        html_input = (EditText) findViewById(R.id.id_html_filepath);

        invoke_HTML_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(ActorActivity.this, HTMLViewerActivity.class);

                i2.putExtra("html_input", html_input.getText().toString());
                i2.putExtra("html_title_input", html_title_input.getText().toString());

                startActivity(i2);
            }
        });
    }
}
