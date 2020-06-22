package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ex4Activity extends AppCompatActivity {


    private EditText callEditText;
    private EditText openWebsiteEditText;
    private EditText openLocationEditText;
    private EditText shareTextEditText;
    private Button callButton;
    private Button shareTextButton;
    private Button openLocationButton;
    private Button openWebsiteButton;
    private String information;
    private int phoneNumber;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
        callEditText=findViewById(R.id.callEditText);
        openWebsiteEditText=findViewById(R.id.openWebsiteEditText);
        openLocationEditText=findViewById(R.id.openLocationEditText);
        shareTextEditText=findViewById(R.id.shareTextEditText);
    }

    public void callOnClick(View view) {
        phoneNumber=Integer.valueOf(callEditText.getText().toString());
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+phoneNumber));
        startActivity(intent);
    }

    public void openWebsiteOnClick(View view) {
        information=openWebsiteEditText.getText().toString();
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(information));
        startActivity(intent);
    }

    public void shareTextOnClick(View view) {
        information=shareTextEditText.getText().toString();
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, information);
        startActivity(Intent.createChooser(intent, "Share..."));
    }

    public void openLocationOnClick(View view) {
        //NEED to look into this, only works if the text int the openLocationEditText is a geo code.
        information=openWebsiteEditText.getText().toString();
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(information));
        startActivity(intent);
    }
}
