package com.example.shradha.sharethoughts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView web ;
Intent share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web=findViewById(R.id.web);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://google.com/");
    }

    public  void share(View v){
        share=new Intent(android.content.Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_SUBJECT,"My App");
        share.putExtra(Intent.EXTRA_TEXT,"share body");
        share.putExtra(Intent.EXTRA_SUBJECT,"My App");
        startActivity(Intent.createChooser(share,"share via"));

    }
    public void  k(View v)
    {
        Intent intent=new Intent(this,Main2Activity.class);

        startActivity(intent);
    }

}
