package com.hust.haolv.foody.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hust.haolv.foody.BuildConfig;
import com.hust.haolv.foody.login.LoginActivity;
import com.hust.haolv.foody.R;


public class SplashActivity extends AppCompatActivity {
    private TextView versionText;
    private TextView loadingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        versionText = findViewById(R.id.versionText);
        versionText.setText("Version " + BuildConfig.VERSION_NAME);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, 2000);

    }

}
