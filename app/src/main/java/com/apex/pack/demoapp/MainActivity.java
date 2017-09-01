package com.apex.pack.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

import static com.apex.pack.demoapp.R.id.myName;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {


        EditText myName = (EditText) findViewById(R.id.myName);

        Log.i("Info", myName.getText().toString());

        Toast.makeText(this, myName.getText().toString() + ("?"), Toast.LENGTH_LONG).show();

    }
}


