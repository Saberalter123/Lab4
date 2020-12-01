package com.example.android_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bn1 = findViewById(R.id.button1);
        bn1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     EditText ed = findViewById(R.id.url);
                     final String url = ed.getText().toString();
                     Intent intent = new Intent();
                     intent.setAction(Intent.ACTION_VIEW);
                     intent.setData(Uri.parse(url));
                     startActivity(intent);
                 }
             }
        );
    }
}