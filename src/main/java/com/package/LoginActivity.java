package com.package;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.WindowManager;
import android.support.v4.content.ContextCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init() {
        // EditText

        AppCompatEditText email = (AppCompatEditText) findViewById(R.id.email);
        AppCompatEditText password = (AppCompatEditText) findViewById(R.id.password);

        // EditText line color
        email.getBackground().setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.md_light_blue_500), PorterDuff.Mode.SRC_ATOP);
        password.getBackground().setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.md_light_blue_500), PorterDuff.Mode.SRC_ATOP);

        // Button
        ColorStateList csl = new ColorStateList(new int[][]{new int[0]}, new int[]{ContextCompat.getColor(getApplicationContext(), R.color.md_light_blue_500)});

        AppCompatButton signIn = (AppCompatButton) findViewById(R.id.buttonSignIn);
        AppCompatButton signUp = (AppCompatButton) findViewById(R.id.buttonSignUp);

        signIn.setSupportBackgroundTintList(csl);
        signUp.setSupportBackgroundTintList(csl);

        // StatusBar color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.md_light_blue_700));
        }
    }

}
