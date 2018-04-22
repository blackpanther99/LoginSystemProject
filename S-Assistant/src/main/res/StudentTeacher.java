package com.example.android.loginsystemproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StudentTeacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_teacher);
    }
    public void teacherLogin(View view)
    {
        Intent teacherLogin = new Intent(StudentTeacher.this, teacherRegister.class);
        startActivity(teacherLogin);
    }
    public  void studentLogin(View view)
    {
        Intent studentLogin = new Intent(StudentTeacher.this, studentRegister.class);
        startActivity(studentLogin);
    }
}
