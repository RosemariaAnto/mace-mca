package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView nametv;
    TextView marktv;
    ImageView imageiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        nametv=(TextView) findViewById(R.id.tv1);
        marktv=(TextView) findViewById(R.id.tv2);
        imageiv=(ImageView) findViewById(R.id.iv1);

        String name=getIntent().getStringExtra("name");
        int mark=getIntent().getIntExtra("mark",0);

        nametv.setText("Name: "+name);
        marktv.setText("Mark: "+mark);

        if (mark<80){
            imageiv.setImageResource(R.drawable.sad);
        }
        else{
            imageiv.setImageResource(R.drawable.happy);
        }
    }
}
