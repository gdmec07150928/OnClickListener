package com.example.lky.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn2= (Button) findViewById(R.id.button2);
        btn2.setText("内部类");
        btn2.setOnClickListener(new Neibu());
    }
    class Neibu implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(Main2Activity.this,"内部类",Toast.LENGTH_SHORT).show();
        }
    }
}
