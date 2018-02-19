package com.example.shri.playkbcwithme;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private ImageButton ibIntro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton ibIntro1 = findViewById(R.id.ibIntro1);
        ibIntro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlayIntro1();
            }
        });



    }// onCreate

    public void PlayIntro1(){
        Toast.makeText(this,"asdf",Toast.LENGTH_LONG).show();
        //

    }

}//main activity class

