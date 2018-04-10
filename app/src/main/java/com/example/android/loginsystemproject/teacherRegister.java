package com.example.android.loginsystemproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class teacherRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_register);
    }
    public void teacherLogin(View view)
    {
        Intent teacherLogin = new Intent(teacherRegister.this, teacherLogin.class);
        startActivity(teacherLogin);

    }
}
