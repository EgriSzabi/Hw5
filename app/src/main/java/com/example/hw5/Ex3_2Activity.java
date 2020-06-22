package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ex3_2Activity extends AppCompatActivity {
    private String messageToSend;
    private EditText editText2;
    public static String MESSAGE="Message";
    private TextView textView2_1;
    private TextView textView2_2;
    private static String messageReceived="Message received";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_2);
        textView2_1=findViewById(R.id.textView2_1);
        textView2_2=findViewById(R.id.textView2_2);
        editText2=findViewById(R.id.editText2);



    }

    protected void onStart() {

        super.onStart();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String message = bundle.getString(Ex3_1Activity.MESSAGE);
            textView2_1.setText(messageReceived);
            textView2_2.setText(message);
        }

    }


    public void sendMessageOnClick(View view) {
        Intent intent= new Intent(Ex3_2Activity.this,Ex3_1Activity.class);
        messageToSend=editText2.getText().toString();
        intent.putExtra(MESSAGE,messageToSend);
        startActivity(intent);
    }
}
