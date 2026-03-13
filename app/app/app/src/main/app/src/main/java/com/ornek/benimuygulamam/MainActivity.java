package com.ornek.benimuygulamam;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        setContentView(webView);

        String html = "<html><body style='display:flex;justify-content:center;align-items:center;height:100vh;font-family:Arial;background:#111827;color:white;'><div style='text-align:center;'><h1>Benim Uygulamam</h1><p>İlk APK denemesi</p></div></body></html>";
        webView.loadDataWithBaseURL(null, html, "text/html", "utf-8", null);
    }
}
