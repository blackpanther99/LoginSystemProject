package com.example.android.loginsystemproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class studentRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);
    }
    public void studentLogin(View view)
    {
        Intent teacherLogin = new Intent(studentRegister.this, studentLogin.class);
        startActivity(teacherLogin);

    }
    public void StudentRegister(View view) {
        Intent studentRegister = new Intent(studentRegister.this, studentRegistration.class);
        startActivity(studentRegister);
    }
}
