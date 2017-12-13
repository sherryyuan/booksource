package com.example.liyuanma.broadcastbestpracticeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by liyuanma on 2017-12-13.
 */

public class LoginActivity extends BaseActivity {
    public final static String TAG = "LoginActivity";

    private EditText usernameView;
    private EditText passwordView;
    private Button login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameView = findViewById(R.id.input_username);
        passwordView = findViewById(R.id.input_password);
        login = findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameView.getText().toString();
                String password = passwordView.getText().toString();
                Log.d(TAG, "onClick: " + username);
                Log.d(TAG, "onClick: " + password);
//                if (!username.equals("admin") && password.equals("123456")) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
//                } else {
//                    Toast.makeText(LoginActivity.this, "account or password invalid",
//                            Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }
}
