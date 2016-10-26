package com.example.lky.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button btn3= (Button) findViewById(R.id.button3);
        btn3.setText("匿名内部类");
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this,"匿名内部类",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
