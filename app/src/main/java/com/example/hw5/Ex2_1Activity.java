package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ex2_1Activity extends AppCompatActivity {
    public static String MESSAGE="Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_1);
    }

    public void text1ToActivity2(View view) {
        Intent intent= new Intent(Ex2_1Activity.this,Ex2_2Activity.class);
        intent.putExtra(MESSAGE,getString(R.string.longString1));
        startActivity(intent);
    }

    public void text2ToActivity2(View view) {
        Intent intent= new Intent(Ex2_1Activity.this,Ex2_2Activity.class);
        intent.putExtra(MESSAGE, getString(R.string.longString2));
        startActivity(intent);
    }

    public void text3ToActivity3(View view) {
        Intent intent= new Intent(Ex2_1Activity.this,Ex2_2Activity.class);
        intent.putExtra(MESSAGE, getString(R.string.longStrign3));
        startActivity(intent);
    }
}
