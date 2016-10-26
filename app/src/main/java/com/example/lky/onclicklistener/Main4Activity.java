package com.example.lky.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button btn4= (Button) findViewById(R.id.button4);
        btn4.setText("外部类");
        btn4.setOnClickListener(new waibu());
    }
}
class waibu implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"外部类",Toast.LENGTH_SHORT).show();
    }
}