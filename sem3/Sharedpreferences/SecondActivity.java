package com.example.shared_preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences sp;
    private TextView userview,emailview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sp = getSharedPreferences("MyPref",MODE_PRIVATE);
        userview = findViewById(R.id.userview);
        emailview = findViewById(R.id.emailview);
        if (sp.contains("Name"))
            userview.setText(sp.getString("Name",""));
        if (sp.contains("Email"))
            emailview.setText(sp.getString("Email",""));
    }
    public void previousActivity(View v){
        System.out.println("Previous");
        startActivity(new Intent(this,MainActivity.class));


    }


}
