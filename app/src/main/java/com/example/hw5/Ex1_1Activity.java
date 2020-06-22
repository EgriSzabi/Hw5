package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;

public class Ex1_1Activity extends AppCompatActivity {
    private static String TAG="Ex1";
    private static String message="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1_1);
        Log.e(TAG,"onCreate");
    }
    protected void onStart() {
        super.onStart();
        //Log.e error
        //Log.w warning
        //Log.i info
        //Log.v verbose
        //Log.wtf what a terrible failure
        Log.e(TAG,"onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.e(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }

    public void goToSecondActivity(View view) {
        Intent intent= new Intent(Ex1_1Activity.this,Ex1_2Activity.class);
        intent.putExtra(message,"Hello secondActivity");
        Log.e(TAG,"opening second activity");
        startActivity(intent);
    }
}
