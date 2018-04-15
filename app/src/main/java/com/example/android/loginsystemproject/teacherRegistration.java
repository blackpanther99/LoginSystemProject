package com.example.android.loginsystemproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class teacherRegistration extends AppCompatActivity {
    Button tregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_registration);
        tregister = (Button)findViewById(R.id.ButtonRegisterTeacher);
    }
}
