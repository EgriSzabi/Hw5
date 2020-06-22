package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ex3_1Activity extends AppCompatActivity {

    private EditText editText1;
    public static String MESSAGE="Message";
    public String messageToSend;
    private TextView textView1_1;
    private TextView textView1_2;
    private static String messageReceived="Message received";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_1);
        editText1=findViewById(R.id.editText1);
        textView1_1=findViewById(R.id.textView1_1);
        textView1_2=findViewById(R.id.textView1_2);


    }
    protected void onStart() {

        super.onStart();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(Ex3_2Activity.MESSAGE);
            textView1_1.setText(messageReceived);
            textView1_2.setText(message);
        }

    }



    public void sendMessageOnClick(View view) {
        Intent intent= new Intent(Ex3_1Activity.this,Ex3_2Activity.class);
        messageToSend=editText1.getText().toString();
        intent.putExtra(MESSAGE,messageToSend);
        startActivity(intent);
    }

}
