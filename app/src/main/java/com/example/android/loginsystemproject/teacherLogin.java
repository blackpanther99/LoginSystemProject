package com.example.android.loginsystemproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class teacherLogin extends AppCompatActivity {
    EditText temail,tpassword;
    Button tlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
        temail = (EditText)findViewById(R.id.LoginEmailTeacher);
        tpassword = (EditText)findViewById(R.id.LoginPasswordTeacher);
        tlogin = (Button)findViewById(R.id.ButtonLoginTeacher);
    }
}
