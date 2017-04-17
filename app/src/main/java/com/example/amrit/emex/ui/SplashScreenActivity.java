package com.example.amrit.emex.ui;

/**
 * Created by amrit on 13/4/17.
 */

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.amrit.emex.R;

/**
 * splash screen acticity
 */
public class SplashScreenActivity extends AppCompatActivity {
    private static final int SPLASH_SCREEN_TIMEOUT = 5000, REQUEST_CODE = 02;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Button btnLogin = (Button) findViewById(R.id.btn_Login);
        final Button btnSignup = (Button) findViewById(R.id.btn_Signup);

        btnLogin.setVisibility(View.GONE);
        btnSignup.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btnLogin.setVisibility(View.VISIBLE);
                btnSignup.setVisibility(View.VISIBLE);

            }
        }, SPLASH_SCREEN_TIMEOUT);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent intent = new Intent(SplashScreenActivity.this, SignupActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    /**
     * @param requestCode request code
     * @param resultCode  result code
     * @param intent      intent
     */
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent intent) {
        if (resultCode == RESULT_OK) {
            Intent intent1 = new Intent(SplashScreenActivity.this, HomeActivity.class);
            startActivity(intent1);
            finish();
        }


    }
}
