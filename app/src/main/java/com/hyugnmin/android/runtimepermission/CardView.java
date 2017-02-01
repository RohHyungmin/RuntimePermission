package com.hyugnmin.android.runtimepermission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CardView extends AppCompatActivity {

    TextView textName, textNumber;
    ImageButton BtnCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        textName = (TextView) findViewById(R.id.textName);
        textNumber = (TextView) findViewById(R.id.textNumber);
        BtnCall = (ImageButton) findViewById(R.id.BtnCall);

    }
}
