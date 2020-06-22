package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Ex2_2Activity extends AppCompatActivity {
    private TextView textView;
    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_2);
        scrollView=findViewById(R.id.scrollView);
        textView=findViewById(R.id.scrollViewTextView);
        Bundle bundle=getIntent().getExtras();
        if(bundle!= null){
                String message =bundle.getString(Ex2_1Activity.MESSAGE);
                Toast.makeText(this, R.string.somethingWrong,Toast.LENGTH_LONG).show();
                textView.setText(message);

        }
    }

}
