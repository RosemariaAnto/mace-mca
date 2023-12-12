package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {
    EditText nameet;
    EditText market;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameet = (EditText) findViewById(R.id.et1);
        market = (EditText) findViewById(R.id.et2);
    }

        public void verify(android.view.View view){

            String name=nameet.getText().toString();
            int mark=Integer.parseInt(market.getText().toString());

            Intent i=new Intent(this,ResultActivity.class);
            i.putExtra("name", name);
            i.putExtra("mark", mark);
            startActivity(i);
        }
}
