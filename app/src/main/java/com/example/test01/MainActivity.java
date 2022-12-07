package com.example.test01;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/**
 * a.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        system.out.println("Hello");
    }
}