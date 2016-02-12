package com.example.dongja94.sampleautologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new LoginFragment())
                    .commit();
        }
    }

    public void changeSingup() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new SignupFragment())
                .addToBackStack(null)
                .commit();
    }
}
