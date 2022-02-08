package com.example.p3l03rachakondajay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button tr, tl, br, bl, mb;
    int num;
    RelativeLayout header;
    TextView headertext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tl = findViewById(R.id.topleftbutton);
        tr = findViewById(R.id.toprightbutton);
        bl = findViewById(R.id.bottomleftbutton);
        br = findViewById(R.id.bottomrightbutton);
        mb = findViewById(R.id.menubutton);
        header = findViewById(R.id.header);
        headertext = findViewById(R.id.headertext);
        num = 0;
    }
    public void increment(View view){
        num++;
        tl.setText("" + num);
    }
    public void menu(View view){

            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(intent);

    }
}