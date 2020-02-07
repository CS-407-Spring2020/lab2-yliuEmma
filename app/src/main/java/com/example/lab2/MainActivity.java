package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked (View view){
        Log.i("Info", "Button CLicked!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
